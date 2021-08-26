package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.Customer;
import com.fivehl.tp2.Model.Demograph;

import java.util.HashSet;
import java.util.Set;

public class DemographRepository implements  IDemographRepository {

    private static DemographRepository repository = null;
    private Set<Demograph> demographDB = null;

    private DemographRepository() {
        demographDB = new HashSet<Demograph>();
    }

    public static DemographRepository getRepository(){
        if(repository == null)
            repository = new DemographRepository();
        return repository;
    }

    @Override
    public Demograph create(Demograph demograph) {
        boolean success = this.demographDB.add(demograph);
        if(!success)
            return null;

        return demograph;
    }

    @Override
    public Demograph read(String gender) {

        for (Demograph demograph : this.demographDB) {
            if (demograph.getGender().equalsIgnoreCase(gender))
                return demograph;
        }

        return null;
    }

    @Override
    public Demograph update(Demograph demograph) {
        Demograph preUpdate = read(demograph.getGender());

        if (preUpdate != null) {
            this.demographDB.remove(preUpdate);
            this.demographDB.add(demograph);
            return demograph;
        }

        return null;
    }

    @Override
    public boolean delete(String gender) {
        Demograph demographToDelete = read(gender);

        if (demographToDelete != null) {
            this.demographDB.remove(demographToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Demograph> getAll() {
        return demographDB;
    }
}

