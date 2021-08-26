package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.OrderItem;

public class OrderItemFactory {
    public static OrderItem newOrderItem(int quantity)
    {

        OrderItem orderItem = new OrderItem.Builder().setQuantity(quantity).build();

        return orderItem;
    }

}

