package org.example.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("활과 화살로 적을 공격합니다");
    }
}
