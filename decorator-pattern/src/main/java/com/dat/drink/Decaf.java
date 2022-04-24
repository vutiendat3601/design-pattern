package com.dat.drink;

import com.dat.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05d;
    }

}
