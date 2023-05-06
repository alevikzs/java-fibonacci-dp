package org.alevikzs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FibonacciRecursion.calc(n));
        System.out.println(FibonacciMemoization.calc(n));
        System.out.println(FibonacciTabulation.calc(n));
    }

}