package org.example.Weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("칼로 상대방을 베어버린다..");
    }
}
