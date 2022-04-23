package com.dat;

import com.dat.model.MallardDuck;
import com.dat.model.ModelDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ModelDuck modelDuck = new ModelDuck("Model Duck A");
        MallardDuck mallardDuck = new MallardDuck("Mallard Duck A");
        mallardDuck.performFly();
        modelDuck.performQuack();
    }
}
