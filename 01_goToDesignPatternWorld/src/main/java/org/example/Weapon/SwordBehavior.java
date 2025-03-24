package org.example.Weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("검으로 상대방을 베어버린다..");
    }
}
