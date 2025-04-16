package org.example;

public class Singleton {
    private static volatile Singleton instance;
    private static int cnt;

    private Singleton() {
        System.out.println("싱글톤 생성자 호출됨 " + cnt++);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }

        return instance;
    }
}
