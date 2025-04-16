package org.example;

public class Stereo {

    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " 오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println(room + " 오디오가 꺼졌습니다.");
    }

    public void setCd() {
        System.out.println(room + " cd를 삽입합니다.");
    }

    public void setDvd() {
        System.out.println(room +" DVD를 삽입합니다.");
    }

    public void setRadio() {
        System.out.println(room + " Radio를 켭니다.");
    }

    public void setVolume(int volume) {
        System.out.println("볼률을 " + volume + "로 설정합니다.");
    }
}
