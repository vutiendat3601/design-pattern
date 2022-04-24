package com.dat.decorator;

public class Whip extends CondimentDecorator {

    public Whip() {
        description = "Whip";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return super.cost() + 0.1d;
    }
}

