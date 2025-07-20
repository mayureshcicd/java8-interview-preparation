package com.jav8.training.interview.multiThreading;

import java.util.LinkedList;

public class ProducerConsumer {
    static LinkedList<Integer> buffer = new LinkedList<>();
    static int capacity = 5;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == capacity) {
                        try { buffer.wait(); } catch (InterruptedException e) {}
                    }
                    buffer.add(value);
                    System.out.println("Produced: " + value++);
                    buffer.notify();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try { buffer.wait(); } catch (InterruptedException e) {}
                    }
                    int val = buffer.removeFirst();
                    System.out.println("Consumed: " + val);
                    buffer.notify();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
