package com.fivehl.tp2.Model;

public class Customer {

    private String customerNumber, firstName, lastName;


    public String getCustomerNumber() {
        return customerNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    private Customer(Customer.Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    public static class Builder {

        private String customerNumber;
        private String firstName;
        private String lastName;


        public Customer.Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public Customer.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Customer.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        public Customer build() {
            return new Customer(this);
        }

        public Customer.Builder copy(Customer customer) {
            this.customerNumber = customer.customerNumber;
            this.firstName= customer.firstName;
            this.lastName = customer.lastName;
            return this;
        }
    }
}



