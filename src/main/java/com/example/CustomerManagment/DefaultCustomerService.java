package com.example.CustomerManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefaultCustomerService implements CustomerService{

    @Autowired
    @Qualifier("hibernateCustomerDataAccess")
    private CustomerDataAccess customerDataAccess;

    @Transactional
    @Override
    public List<Customer> getCustomers(int amount) {
        return customerDataAccess.getCustomers(amount);
    }

    @Transactional
    @Override
    public List<Customer> getCustomersInverse(int amount) {
        return customerDataAccess.getCustomersReversedOrder(amount);
    }

    @Transactional
    @Override
    public List<Customer> getAllCustomers() {
        return customerDataAccess.getAllCustomers();
    }

    @Transactional
    @Override
    public void addCustomer(Customer customer) {
        customerDataAccess.addCustomer(customer);
    }


}
