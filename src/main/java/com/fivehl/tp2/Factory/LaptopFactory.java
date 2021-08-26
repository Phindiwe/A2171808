package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.Laptop;

import java.math.BigDecimal;

public class LaptopFactory {
    public static Laptop newLaptop(String laptopName, BigDecimal unitPrice)
    {

        Laptop laptop = new Laptop.Builder().setLaptopName(laptopName).setUnitPrice(unitPrice).build();

        return laptop;
    }
}
