package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Repository.IRepository;

import java.util.Set;

public interface IContactCategoryRepository extends IRepository<ContactCategory, String> {
    public Set<ContactCategory> getAll();
}
