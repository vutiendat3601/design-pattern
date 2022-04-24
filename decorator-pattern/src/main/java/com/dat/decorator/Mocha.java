package com.dat.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha() {
        description = "Mocha";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return super.cost() + 0.20d;
    }
}
