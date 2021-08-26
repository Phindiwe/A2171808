package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.Order;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface IOrderRepository extends IRepository<Order, String> {
    public Set<Order> getAll();
}