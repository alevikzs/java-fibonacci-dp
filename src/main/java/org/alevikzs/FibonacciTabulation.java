package org.alevikzs;

public class FibonacciTabulation {

    static int calc(int number) {
        if (number <= 1) {
            return number;
        }
        int prev1 = 0;
        int prev2 = 1;
        int result = prev2;
        for (int i = 2; i <= number; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

}