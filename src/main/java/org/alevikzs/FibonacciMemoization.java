package org.alevikzs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciMemoization {

    private static final Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    static int calc(int number) {
        if (number <= 1) {
            return number;
        }
        return cache.computeIfAbsent(number, n -> calc(n - 2) + calc(n - 1));
    }

}