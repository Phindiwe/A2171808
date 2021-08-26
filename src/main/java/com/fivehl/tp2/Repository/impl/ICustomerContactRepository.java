package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.CustomerContact;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface ICustomerContactRepository extends IRepository<CustomerContact, String> {
    public Set<CustomerContact> getAll();
}

