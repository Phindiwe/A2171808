package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.Demograph;
import com.fivehl.tp2.Model.Laptop;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface ILaptopRepository extends IRepository<Laptop, String> {
    public Set<Laptop> getAll();
}