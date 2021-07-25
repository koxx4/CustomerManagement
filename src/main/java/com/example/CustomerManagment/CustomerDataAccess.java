package com.example.CustomerManagment;

import java.util.List;

public interface CustomerDataAccess {
     Customer getCustomerWithId(int id);
     List<Customer> getAllCustomers();
     List<Customer> getCustomers(int amount);
     void deleteCustomer(Customer customer);
     void deleteCustomerWithId(int id);
     void updateCustomer(Customer customerToUpdate, Customer updatedCustomer);
     void updateCustomerWithId(int id, Customer updatedCustomer);
     void addCustomer(Customer customer);
     List<Customer> getCustomersReversedOrder(int amount);
}
