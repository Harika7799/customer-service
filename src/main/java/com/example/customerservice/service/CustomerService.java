package com.example.customerservice.service;

import com.example.customerservice.demo.Customer;
import java.util.List;

public interface CustomerService {
 public Customer createCustomer(Customer customer);
 public List<Customer> getAllCustomer();
}
