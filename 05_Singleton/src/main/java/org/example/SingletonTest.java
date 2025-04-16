package org.example;

import java.util.concurrent.CountDownLatch;

public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            countDownLatch.countDown();
        };

        for (int i = 0; i < threadCount; i++) {
            new Thread(task).start();
        }

        countDownLatch.await();
    }
}
