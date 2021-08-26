package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.Laptop;

import java.util.HashSet;
import java.util.Set;

public class LaptopRepository implements ILaptopRepository {

    private static LaptopRepository repository = null;
    private Set<Laptop> laptopDB = null;

    private LaptopRepository() {
        laptopDB = new HashSet<Laptop>();
    }

    public static LaptopRepository getRepository(){
        if(repository == null)
            repository = new LaptopRepository();
        return repository;
    }

    @Override
    public Laptop create(Laptop laptop) {
        boolean success = this.laptopDB.add(laptop);
        if(!success)
            return null;

        return laptop;
    }

    @Override
    public Laptop read(String laptopName) {

        for (Laptop laptop : this.laptopDB) {
            if (laptop.getLaptopName().equalsIgnoreCase(laptopName))
                return laptop;
        }

        return null;
    }

    @Override
    public Laptop update(Laptop laptop) {
        Laptop preUpdate = read(laptop.getLaptopName());

        if (preUpdate != null) {
            this.laptopDB.remove(preUpdate);
            this.laptopDB.add(laptop);
            return laptop;
        }

        return null;
    }

    @Override
    public boolean delete(String LaptopName) {
        Laptop laptopToDelete = read(LaptopName);

        if (laptopToDelete != null) {
            this.laptopDB.remove(laptopToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Laptop> getAll() {
        return laptopDB;
    }
}



