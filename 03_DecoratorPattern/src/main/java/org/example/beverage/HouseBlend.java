package org.example.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
