package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.Order;
import com.fivehl.tp2.util.GenericHelper;

public class OrderFactory {
    public static Order createOrder(String orderDate) {

        String orderNumber = GenericHelper.generateId();

        Order order = new Order.Builder()
                .setOrderNumber(orderNumber)
                .setOrderDate(orderDate)
                .build();
        return order;
    }
}
