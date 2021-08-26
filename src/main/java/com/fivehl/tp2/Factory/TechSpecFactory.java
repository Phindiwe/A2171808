 package com.fivehl.tp2.Factory;
import com.fivehl.tp2.Model.TechSpec;


public class TechSpecFactory {
    public static TechSpec newTechSpec(String processor, String operatingSystem, String memory, String storage) {

        TechSpec techSpec = new TechSpec.Builder().
                setProcessor(processor).
                setOperatingSystem(operatingSystem).
                setMemory(memory).
                setStorage(storage).
                build();

        return techSpec;
    }

}
