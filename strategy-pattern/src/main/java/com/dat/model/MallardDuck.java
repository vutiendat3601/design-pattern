package com.dat.model;

import com.dat.action.FlyWithWings;
import com.dat.action.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
