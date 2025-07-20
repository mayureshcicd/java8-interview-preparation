package com.jav8.training.interview.multiThreading;

public class DeadlockDemo {
    public static void main(String[] args) {
        final String lock1 = "LOCK1";
        final String lock2 = "LOCK2";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 holding LOCK1...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock2) {
                    System.out.println("Thread1 also got LOCK2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 holding LOCK2...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock1) {
                    System.out.println("Thread2 also got LOCK1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
