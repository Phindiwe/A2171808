package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.OrderItem;

import java.util.HashSet;
import java.util.Set;

public class OrderItemRepository implements IOrderItemRepository {

    private static OrderItemRepository repository = null;
    private Set<OrderItem> orderItemyDB = null;

    private OrderItemRepository() {
        orderItemyDB = new HashSet<OrderItem>();
    }

    public static OrderItemRepository getRepository(){
        if(repository == null)
            repository = new OrderItemRepository();
        return repository;
    }


    public OrderItem create(OrderItem orderItem) {
        boolean success = this.orderItemyDB.add(orderItem);
        if(!success)
            return null;

        return orderItem;
    }


    public OrderItem read(int quantity) {

       // for (OrderItem orderItem : this.orderItemyDB)
        //  if (orderItem.getQuantity().equalsIgnoreCase(quantity))
          //      return orderItem;

        return null;
    }


    public OrderItem update(OrderItem orderItem) {
        OrderItem preUpdate = read(orderItem.getQuantity());

        if (preUpdate != null) {
            this.orderItemyDB.remove(preUpdate);
            this.orderItemyDB.add(orderItem);
            return orderItem;
        }

        return null;
    }


    public boolean delete(int  quantity) {
        OrderItem orderItemToDelete = read(quantity);

        if (orderItemToDelete != null) {
            this.orderItemyDB.remove(orderItemToDelete);
            return true;
        }
        return false;
    }



    public Set<OrderItem> getAll() {
        return orderItemyDB;
    }
}

