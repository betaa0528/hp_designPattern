package org.example;

import org.example.beverage.Beverage;
import org.example.beverage.DarkRoast;
import org.example.beverage.Espresso;
import org.example.beverage.HouseBlend;
import org.example.decorator.Milk;
import org.example.decorator.Mocha;
import org.example.decorator.Soy;
import org.example.decorator.Whip;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new DarkRoast();
        beverage4.setSize(Beverage.Size.TALL);
//        beverage4.setSize(Beverage.Size.GRANDE);
//        beverage4.setSize(Beverage.Size.VENTI);
        beverage4 = new Milk(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("03_DecoratorPattern/src/main/resources/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}