package org.example.Weapon;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("활의 여왕입니다. shoot~");
        weaponBehavior.use();
    }

    public Queen() {
        this.name = "여왕";
        this.weaponBehavior = new BowAndArrowBehavior();
    }


}
