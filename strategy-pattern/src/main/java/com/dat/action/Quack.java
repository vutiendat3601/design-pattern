package com.dat.action;

public class Quack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am quacking");        
    }
    
}
