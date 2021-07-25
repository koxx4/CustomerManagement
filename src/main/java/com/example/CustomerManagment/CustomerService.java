package com.example.CustomerManagment;

import java.util.List;

public interface CustomerService {
     List<Customer> getCustomers(int amount);
     List<Customer> getCustomersInverse(int amount);
     List<Customer> getAllCustomers();
     Customer getCustomerById(int id);
     void saveCustomer(Customer customer);
     void updateCustomer(int id, Customer customerToUpdate);
}
