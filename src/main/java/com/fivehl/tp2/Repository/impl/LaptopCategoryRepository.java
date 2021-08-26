package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.LaptopCategory;

import java.util.HashSet;
import java.util.Set;

public class LaptopCategoryRepository implements ILaptopCategoryRepository {

    private static LaptopCategoryRepository repository = null;
    private Set<LaptopCategory> laptopCategoryDB = null;

    private LaptopCategoryRepository() {
        laptopCategoryDB = new HashSet<LaptopCategory>();
    }

    public static LaptopCategoryRepository getRepository(){
        if(repository == null)
            repository = new LaptopCategoryRepository();
        return repository;
    }


    public LaptopCategory create(LaptopCategory category) {
        boolean success = this.laptopCategoryDB.add(category);
        if(!success)
            return null;

        return category;
    }


    public LaptopCategory read(String category) {

        for (LaptopCategory laptopCategory : this.laptopCategoryDB) {
            if (laptopCategory.getCategory().equalsIgnoreCase(category))
                return laptopCategory;
        }

        return null;
    }


    public LaptopCategory update(LaptopCategory LaptopCategory) {
            LaptopCategory preUpdate = read(LaptopCategory.getCategory());

        if (preUpdate != null) {
            this.laptopCategoryDB.remove(preUpdate);
            this.laptopCategoryDB.add(LaptopCategory);
            return LaptopCategory;
        }

        return null;
    }


    public boolean delete(String category) {
        LaptopCategory lapCategoryToDelete = read(category);

        if (lapCategoryToDelete != null) {
            this.laptopCategoryDB.remove(lapCategoryToDelete);
            return true;
        }
        return false;
    }


    public Set<LaptopCategory> getAll() {
        return laptopCategoryDB;
    }
}

