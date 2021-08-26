package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.Demograph;

public class DemographFactory {
    public static Demograph newDemograph(String gender, String race, String dateOfBirth)
    {

        Demograph demograph = new Demograph.Builder().
                setGender(gender).
                setRace(race).
                setDateOfBirth(dateOfBirth).
                build();

        return demograph;
    }

}
