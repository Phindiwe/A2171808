package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.CustomerContact;

public class CustomerContactFactory {
    public static CustomerContact newCustomerContact(String contactDetails)
    {

        CustomerContact customerContact = new CustomerContact.Builder().setContactDetails(contactDetails).build();

        return customerContact;
    }

}


