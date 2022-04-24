package com.dat.drink;

import com.dat.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99d;
    }

}
