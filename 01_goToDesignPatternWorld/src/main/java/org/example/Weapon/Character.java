package org.example.Weapon;

public abstract class Character {
    String name;
    WeaponBehavior weaponBehavior;

    public Character() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        if(weaponBehavior != null) {
            System.out.println("무기를 변경한다 ~!");
        }
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

    public void display() {
        System.out.printf("나는 %s 이다.!\n", name);
    }
}
