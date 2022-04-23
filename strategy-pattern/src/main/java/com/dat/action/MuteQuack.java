package com.dat.action;

public class MuteQuack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("I don't have quacking functionality");        
    }
}
