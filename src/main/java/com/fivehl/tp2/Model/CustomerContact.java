package com.fivehl.tp2.Model;

import sun.util.calendar.CalendarUtils;

public class CustomerContact {
     private String contactDetails;

    public String getContactDetails() {
        return contactDetails;
    }
    private CustomerContact(CustomerContact.Builder builder) {
        this.contactDetails = builder.contactDetails;
    }



    public static class Builder {

        private String contactDetails;

        public CustomerContact.Builder setContactDetails(String contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public CustomerContact build() {
            return new CustomerContact(this);
        }

        public CustomerContact.Builder copy(CustomerContact customerContact) {
            this.contactDetails = customerContact.contactDetails;
            return this;
        }
    }
}

