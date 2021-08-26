package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.Customer;
import com.fivehl.tp2.util.GenericHelper;

public class CustomerFactory {
    public static Customer createCustomer(String firstName, String lastName ) {

        String customerNumber = GenericHelper.generateId();

        Customer customer = new Customer.Builder()
                .setCustomerNumber(customerNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
        return customer;
   }
}
