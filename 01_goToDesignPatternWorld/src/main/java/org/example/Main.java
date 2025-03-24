package org.example;

import org.example.Weapon.*;
import org.example.Weapon.Character;

public class Main {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck model = new ModelDuck();
//        model.performFly();
//        model.performQuack();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();

        Character knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new BowAndArrowBehavior());
        knight.fight();
        System.out.println("==========================");
        Character queen = new Queen();
        queen.fight();


    }
}