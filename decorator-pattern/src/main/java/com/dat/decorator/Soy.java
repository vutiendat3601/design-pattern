package com.dat.decorator;

public class Soy extends CondimentDecorator {

    public Soy() {
        description = "Soy";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return super.cost() + 0.15d;
    }
}

