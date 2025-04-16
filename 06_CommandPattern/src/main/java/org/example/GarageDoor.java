package org.example;

public class GarageDoor {

    String name;

    GarageDoor(String name) {
        this.name = name;
    }
    public void up() {
        System.out.println(name + " 문이 열렸습니다.");
    }

    public void down(){}
    public void stop(){}
    public void lightOn(){}
    public void lightOff(){}
}
