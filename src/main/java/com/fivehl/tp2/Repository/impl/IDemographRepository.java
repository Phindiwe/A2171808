package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.Customer;
import com.fivehl.tp2.Model.Demograph;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface IDemographRepository extends IRepository<Demograph, String> {
    public Set<Demograph> getAll();
}
