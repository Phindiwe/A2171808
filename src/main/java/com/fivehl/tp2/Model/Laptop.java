package com.fivehl.tp2.Model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Laptop {
    private String laptopName;
    private BigDecimal unitPrice;

    public String getLaptopName() {
        return laptopName;
    }
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
    private Laptop(Laptop.Builder builder) {
        this.laptopName = builder.laptopName;
        this.unitPrice = builder.unitPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopName='" + laptopName + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }


    public static class Builder {

        private String laptopName;
        private BigDecimal unitPrice;


        public Laptop.Builder setLaptopName(String laptopName) {
            this.laptopName = laptopName;
            return this;
        }
        public Laptop.Builder setUnitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }


        public Laptop build() {
            return new Laptop(this);
        }

        public Laptop.Builder copy(Laptop laptop) {
            this.laptopName = laptop.laptopName;
            this.unitPrice= laptop.unitPrice;
            return this;
        }
    }
}




