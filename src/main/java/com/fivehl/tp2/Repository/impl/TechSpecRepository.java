package com.fivehl.tp2.Repository.impl;

import com.fivehl.tp2.Model.ContactCategory;
import com.fivehl.tp2.Model.TechSpec;

import java.util.HashSet;
import java.util.Set;

public class TechSpecRepository implements ITechSpecRepository {

    private static TechSpecRepository repository = null;
    private Set<TechSpec> techSpecDB = null;

    private TechSpecRepository() {
        techSpecDB = new HashSet<TechSpec>();
    }

    public static TechSpecRepository getRepository(){
        if(repository == null)
            repository = new TechSpecRepository();
        return repository;
    }


    public TechSpec create(TechSpec techSpec) {
        boolean success = this.techSpecDB.add(techSpec);
        if(!success)
            return null;

        return techSpec;
    }


    public TechSpec read(String processor) {

       // for (TechSpec techSpec : this.techSpecDB) {
           // if (TechSpec.getProcessor().equalsIgnoreCase(processor))
              //  return techSpec;
       // }

        return null;
    }


    public TechSpec update(TechSpec techSpec) {
        TechSpec preUpdate = read(techSpec.getProcessor());

        if (preUpdate != null) {
            this.techSpecDB.remove(preUpdate);
            this.techSpecDB.add(techSpec);
            return techSpec;
        }

        return null;
    }


    public boolean delete(String processor) {
        TechSpec techToDelete = read(processor);

        if (techToDelete != null) {
            this.techSpecDB.remove(techToDelete);
            return true;
        }
        return false;
    }



    public Set<TechSpec> getAll() {
        return techSpecDB;
    }
}

