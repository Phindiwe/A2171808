package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;

import java.util.HashSet;
import java.util.Set;


public class ContactCategoryRepository implements IContactCategoryRepository {

    private static ContactCategoryRepository repository = null;
    private Set<ContactCategory> contactCategoryDB = null;

    private ContactCategoryRepository() {
        contactCategoryDB = new HashSet<ContactCategory>();
    }

    public static ContactCategoryRepository getRepository(){
        if(repository == null)
            repository = new ContactCategoryRepository();
        return repository;
    }

    @Override
    public ContactCategory create(ContactCategory contactCategory) {
        boolean success = this.contactCategoryDB.add(contactCategory);
        if(!success)
            return null;

        return contactCategory;
    }

    @Override
    public ContactCategory read(String categoryName) {

        for (ContactCategory contactCategory : this.contactCategoryDB) {
            if (contactCategory.getCategoryName().equalsIgnoreCase(categoryName))
                return contactCategory;
        }

        return null;
    }

    @Override
    public ContactCategory update(ContactCategory contactCategory) {
        ContactCategory preUpdate = read(contactCategory.getCategoryName());

        if (preUpdate != null) {
            this.contactCategoryDB.remove(preUpdate);
            this.contactCategoryDB.add(contactCategory);
            return contactCategory;
        }

        return null;
    }

    @Override
    public boolean delete(String CategoryName) {
        ContactCategory contactCategoryToDelete = read(CategoryName);

        if (contactCategoryToDelete != null) {
            this.contactCategoryDB.remove(contactCategoryToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<ContactCategory> getAll() {
        return contactCategoryDB;
    }
}

