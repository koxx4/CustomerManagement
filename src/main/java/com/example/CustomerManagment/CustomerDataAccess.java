package com.example.CustomerManagment;

import java.util.List;

public interface CustomerDataAccess {
    public Customer getCustomerWithId(int id);
    public List<Customer> getAllCustomers();
    public List<Customer> getCustomers(int amount);
    public void deleteCustomer(Customer customer);
    public void deleteCustomerWithId(int id);
    public void updateCustomer(Customer customerToUpdate, Customer updatedCustomer);
    public void updateCustomerWithId(int id, Customer updatedCustomer);
    public void addCustomer(Customer customer);
}
