package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    Customer findCustomerById(long custid);

    List<Customer> findByNameLike(String subname);
}
