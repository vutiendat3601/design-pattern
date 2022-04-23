package com.dat.action;

public class Squeak implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am squeaking....");        
    }

}
