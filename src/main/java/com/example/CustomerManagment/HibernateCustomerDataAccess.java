package com.example.CustomerManagment;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateCustomerDataAccess implements CustomerDataAccess{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public Customer getCustomerWithId(int id) {

        Customer foundCustomer;
        var session = sessionFactory.getCurrentSession();

        try {

            foundCustomer = (Customer) session.createQuery("FROM Customer AS c WHERE c.id = :id")
                    .setParameter("id", id).getSingleResult();

        } catch (Exception e){
            return null;
        }

        return foundCustomer;
    }

    @Override
    public List<Customer> getAllCustomers() {

        var session = sessionFactory.getCurrentSession();
        var customers = session.createQuery("FROM Customer")
                .getResultList();

        return customers;
    }

    @Override
    public List<Customer> getCustomers(int amount) {

        var session = sessionFactory.getCurrentSession();
        var customers = session.createQuery("FROM Customer").
                setMaxResults(amount)
                .getResultList();

        return customers;
    }


    @Override
    public void deleteCustomer(Customer customer) {
        var session = sessionFactory.getCurrentSession();
        session.delete(customer);
    }


    @Override
    public void deleteCustomerWithId(int id) {
        var session = sessionFactory.getCurrentSession();
        session.createQuery("DELETE Customer WHERE id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }


    @Override
    public void updateCustomerWithId(int id, Customer updatedCustomer) {

        var session = sessionFactory.getCurrentSession();
        var customerToUpdate = session.get(Customer.class, id);

        customerToUpdate.setFirstName(updatedCustomer.getFirstName());
        customerToUpdate.setLastName(updatedCustomer.getLastName());
        customerToUpdate.setEmail(updatedCustomer.getEmail());
        customerToUpdate.setGender(updatedCustomer.getGender());
        customerToUpdate.setIpAddress(updatedCustomer.getIpAddress());

        session.update(customerToUpdate);
    }


    @Override
    public void addCustomer(Customer customer) {
        var session = sessionFactory.getCurrentSession();
        session.save(customer);
    }

    @Override
    public List<Customer> getCustomersReversedOrder(int amount) {
        var session = sessionFactory.getCurrentSession();
        var customers = session.createQuery("FROM Customer AS c ORDER BY c.id DESC").
                setMaxResults(amount)
                .getResultList();

        return customers;
    }

}
