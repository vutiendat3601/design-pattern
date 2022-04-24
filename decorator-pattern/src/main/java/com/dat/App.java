package com.dat;

import com.dat.decorator.Mocha;
import com.dat.drink.HouseBlend;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);

        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost());
    }
}
