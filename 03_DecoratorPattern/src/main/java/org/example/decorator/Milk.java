package org.example.decorator;

import org.example.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public double cost() {
        double cost = 0;
        if(beverage.getSize() == Size.TALL) {
            cost = 0.10;
        } else if(beverage.getSize() == Size.GRANDE) {
            cost = 0.15;
        } else {
            cost = 0.20;
        }
        return beverage.cost() + cost;
    }
}
