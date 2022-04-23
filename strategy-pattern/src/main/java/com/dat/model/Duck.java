package com.dat.model;

import com.dat.action.IFlyBehavior;
import com.dat.action.IQuackBehavior;

public abstract class Duck {
    private String name;
    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("Hello, I am " + name);
    }
}
