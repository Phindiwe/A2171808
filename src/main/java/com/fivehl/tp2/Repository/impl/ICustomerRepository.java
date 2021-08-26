package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.Customer;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String> {
    public Set<Customer> getAll();

}
