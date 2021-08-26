package com.fivehl.tp2.Model;

public class TechSpec {
    public TechSpec(){}

    private String processor,operatingSystem,memory, storage;
    public String getProcessor() {
        return processor;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getMemory() {
        return memory;
    }
    public String getStorage() {
        return storage;
    }

    private TechSpec(Builder builder) {
        this.processor = builder.processor;
        this.operatingSystem = builder.operatingSystem;
        this.storage = builder.storage;
        this.memory = builder.memory;
    }

    @Override
    public String toString() {
        return "TechSpec{" +
                "processor='" + processor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    public static class Builder{

        private String processor, operatingSystem, storage, memory;

    public Builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }



    public Builder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }



    public Builder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }
        public TechSpec build(){
            return new TechSpec(this);
        }

        public Builder copy(TechSpec techSpec){
            this.processor = techSpec.processor;
            this.operatingSystem = techSpec.operatingSystem;
            this.storage = techSpec.storage;
            this.memory = techSpec.memory;

            return this;

        }

    }




}
