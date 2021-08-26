package com.fivehl.tp2.Model;

public class LaptopCategory {
        private String category;


        public String getCategory() {
            return category;
        }
        private LaptopCategory(LaptopCategory.Builder builder) {
            this.category = builder.category;
        }

    @Override
    public String toString() {
        return "LaptopCategory{" +
                "category='" + category + '\'' +
                '}';
    }


    public static class Builder {

    private String category;

    public LaptopCategory.Builder setCategory(String category) {
        this.category = category;
        return this;
    }

    public LaptopCategory build() {
        return new LaptopCategory(this);
    }

    public LaptopCategory.Builder copy(LaptopCategory laptopCategory) {
        this.category = laptopCategory.category;
        return this;
    }
}
}
