package com.jav8.training.interview.multiThreading;

public class EvenOddThread {
    static int count = 1;
    static final int MAX = 10;
/*
* Question 3: Print even and odd numbers using two threads.

Goal: One thread prints even numbers, the other prints odd numbers from 1 to 10.
*
* */
    public static void main(String[] args) {
        Object lock = new Object();

        Thread odd = new Thread(() -> {
            while (count <= MAX) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println("Odd: " + count++);
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        });

        Thread even = new Thread(() -> {
            while (count <= MAX) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println("Even: " + count++);
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        });

        odd.start();
        even.start();
    }
}
