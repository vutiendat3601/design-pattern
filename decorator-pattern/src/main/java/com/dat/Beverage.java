package com.dat;

public abstract class Beverage {
    protected String description;

    public Beverage() {
description = "Unknown beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}