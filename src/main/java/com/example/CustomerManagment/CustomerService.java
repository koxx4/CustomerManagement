package com.example.CustomerManagment;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers(int amount);
    public List<Customer> getCustomersInverse(int amount);
    public List<Customer> getAllCustomers();
    public void addCustomer(Customer customer);
}
