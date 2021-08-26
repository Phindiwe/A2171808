package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements  ICustomerRepository {

    private static CustomerRepository repository = null;
    private Set<Customer> customerDB = null;

    private CustomerRepository() {
        customerDB = new HashSet<Customer>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null)
            repository = new CustomerRepository();
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
        boolean success = this.customerDB.add(customer);
        if(!success)
            return null;

        return customer;
    }

    @Override
    public Customer read(String customerNumber) {

        for (Customer customer : this.customerDB) {
            if (customer.getCustomerNumber().equalsIgnoreCase(customerNumber))
                return customer;
        }

        return null;
    }

    @Override
    public Customer update(Customer customer) {
        Customer preUpdate = read(customer.getCustomerNumber());

        if (preUpdate != null) {
            this.customerDB.remove(preUpdate);
            this.customerDB.add(customer);
            return customer;
        }

        return null;
    }

    @Override
    public boolean delete(String customerNumber) {
        Customer customerToDelete = read(customerNumber);

        if (customerToDelete != null) {
            this.customerDB.remove(customerToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Customer> getAll() {
        return customerDB;
    }
}

