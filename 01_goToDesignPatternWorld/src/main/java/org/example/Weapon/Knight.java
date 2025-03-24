package org.example.Weapon;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("기사는 명예를 위해 싸운다!");
        weaponBehavior.use();
    }

    public Knight() {
        this.name = "기사";
        this.weaponBehavior = new SwordBehavior();
    }


}
