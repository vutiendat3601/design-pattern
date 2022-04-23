package com.dat.model;

import com.dat.action.FlyNoWay;
import com.dat.action.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
