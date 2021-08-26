package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.CreditCard;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface ICreditCardRepository extends IRepository<CreditCard, String> {
    public Set<CreditCard> getAll();
}

