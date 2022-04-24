package com.dat.drink;

import com.dat.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89d;
    }
}
