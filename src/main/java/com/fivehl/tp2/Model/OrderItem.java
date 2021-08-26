package com.fivehl.tp2.Model;

public class OrderItem {

    private int quantity;


    public int getQuantity() {
        return quantity;
    }
    private OrderItem(OrderItem.Builder builder) {
        this.quantity = builder.quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                '}';
    }

    public static class Builder {

        private int quantity;

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }

        public OrderItem.Builder copy(OrderItem orderItem) {
            this.quantity = orderItem.quantity;
            return this;
        }
    }
}
