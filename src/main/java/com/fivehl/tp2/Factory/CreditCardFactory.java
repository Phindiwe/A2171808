package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.CreditCard;
import com.fivehl.tp2.util.GenericHelper;

public class CreditCardFactory {
    public static CreditCard createCreditCard(String nameOnCard, String expiredDate ) {

        String cardNumber = GenericHelper.generateId();

        CreditCard creditCard = new CreditCard.Builder()
                .setCardNumber(cardNumber)
                .setNameOnCard(nameOnCard)
                .setExpiredDate(expiredDate)
                .build();
        return creditCard;
    }
}
