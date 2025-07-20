package com.jav8.training.logical.fibonacciGenerator;


public class FibonacciGenerator {

    public static void main(String[] args) {
        System.out.println("\nFibonacci series (first 15):");
        for (int i = 0; i < 15; i++) {
            System.out.print(FibonacciGenerator.fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}