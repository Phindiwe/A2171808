package com.fivehl.tp2.Model;

public class Demograph {
    private String gender, race;
    private String dateOfBirth;


    public String getGender() {
        return gender;
    }
    public String getRace() {
        return race;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private Demograph(Demograph.Builder builder) {
        this.gender = builder.gender;
        this.race = builder.race;
        this.dateOfBirth = builder.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Demograph{" +
                "gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


    public static class Builder {

        private String gender;
        private String race;
        private String dateOfBirth;


        public Demograph.Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Demograph.Builder setRace(String race) {
            this.race = race;
            return this;
        }
        public Demograph.Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }


        public Demograph build() {
            return new Demograph(this);
        }

        public Demograph.Builder copy(Demograph demograph) {
            this.race = demograph.race;
            this.gender= demograph.gender;
            this.dateOfBirth = demograph.dateOfBirth;
            return this;
        }
    }
}




