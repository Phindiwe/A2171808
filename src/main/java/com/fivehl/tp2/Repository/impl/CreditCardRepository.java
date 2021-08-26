package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.CreditCard;

import java.util.HashSet;
import java.util.Set;

public class CreditCardRepository implements ICreditCardRepository {
    private static CreditCardRepository repository = null;
    private Set<CreditCard> creditCardDB = null;

    private CreditCardRepository() {
        creditCardDB = new HashSet<CreditCard>();
    }

    public static CreditCardRepository getRepository(){
        if(repository == null)
            repository = new CreditCardRepository();
        return repository;
    }

    @Override
    public CreditCard create(CreditCard creditCard) {
        boolean success = this.creditCardDB.add(creditCard);
        if(!success)
            return null;

        return creditCard;
    }

    @Override
    public CreditCard read(String s) {
        return null;
    }


    /* @Override
     public CreditCard read(int cardNumber) {

         for (CreditCard creditCard : this.creditCardDB) {
             if (CreditCard.getCardNumber().equalsIgnoreCase(cardNumber))
                 return creditCard;
         }

         return null;
     }
 */
    @Override
    public CreditCard update(CreditCard creditCard) {
        CreditCard preUpdate = read(creditCard.getCardNumber());

        if (preUpdate != null) {
            this.creditCardDB.remove(preUpdate);
            this.creditCardDB.add(creditCard);
            return creditCard;
        }

        return null;
    }

    @Override
    public boolean delete(String creditCard) {
        CreditCard creditCardToDelete = read(creditCard);

        if (creditCardToDelete != null) {
            this.creditCardDB.remove(creditCardToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<CreditCard> getAll() {
        return creditCardDB;
    }
}

