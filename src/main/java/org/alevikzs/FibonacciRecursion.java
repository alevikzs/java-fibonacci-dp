package org.alevikzs;

public class FibonacciRecursion {
    static int calc(int number) {
        if (number <= 1) {
            return number;
        }
        return calc(number - 1) + calc(number - 2);
    }

}