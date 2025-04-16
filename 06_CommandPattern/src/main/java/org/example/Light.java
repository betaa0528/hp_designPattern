package org.example;

public class Light {

    String room;

    public Light(){}
    public Light(String room) {
        this.room = room;
    }
    public void on(){
        System.out.println(room + " 조명이 켜졌습니다.");
    }
    public void off(){
        System.out.println(room + "조명이 꺼졌습니다");
    }


}
