package org.example;

public class CellingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String room;
    int speed;

    public CellingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void low() {
        speed = LOW;
        System.out.println(room + " 선풍기 속도가 " + speed + "으로 설정되었습니다");

    }

    public void medium() {
        speed = MEDIUM;

        System.out.println(room + " 선풍기 속도가 " + speed + "으로 설정되었습니다");

    }

    public void high() {
        speed = HIGH;
        System.out.println(room + " 선풍기 속도가 " + speed + "으로 설정되었습니다");

    }

    public void off() {
        speed = OFF;
        System.out.println(room + " 선풍기가 꺼졌습니다.");
    }

    public int getSpeed() {
        return speed;
    }


}
