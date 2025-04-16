package org.example;

public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {on = true;}
    public void off() {on = false;}

    public void circulate() {
        if(on) {
            System.out.println("현재 욕조 온도 : " + temperature);
        }
    }
    public void jetsOn() {
        if(on) {
            System.out.println("욕조 jets are on");
        }
    }
    public void jetsOff() {
        if(on) {
            System.out.println("욕조 jets are off");
        }
    }
    public void setTemperature(int temperature) {
        if(temperature > this.temperature) {
            System.out.println("욕조 온도를 " + temperature + "도로 설정합니다.");
        } else {
            System.out.println("욕조 온도를 " + temperature + "도로 설정합니다.");
        }
        this.temperature = temperature;
    }
}
