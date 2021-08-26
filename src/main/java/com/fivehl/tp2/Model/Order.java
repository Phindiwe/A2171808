package com.fivehl.tp2.Model;

public class Order {
    private int orderNumber;
    private String orderDate;

    public int getOrderNumber() {
        return orderNumber;
    }
    public String getOrderDate() {
        return orderDate;
    }
    private Order(Order.Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.orderDate = builder.orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }


    public static class Builder {

        private int orderNumber;
        private String orderDate;


        public Order.Builder setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Order.Builder setOrderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }


        public Order build() {
            return new Order(this);
        }

        public Order.Builder copy(Order order) {
            this.orderNumber = order.orderNumber;
            this.orderDate= order.orderDate;
            return this;
        }
    }
}


