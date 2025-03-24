package org.example.Weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("도끼로 상대방을 두동강 냅니다");
    }
}
