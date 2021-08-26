package com.fivehl.tp2.Factory;

import com.fivehl.tp2.Model.LaptopCategory;

public class LaptopCategoryFactory {
    public static LaptopCategory newLaptopCategory(String category)
    {
        LaptopCategory laptopCategory = new LaptopCategory.Builder().setCategory(category).build();

        return laptopCategory;
    }

}

