package org.example.first;

public class DuckAdapter implements Turkey{

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        int value = (int) (Math.random() * 5) + 1;
        if(value == 5) {
            duck.fly();
        }
    }
}
