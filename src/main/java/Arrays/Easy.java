package main.java.Arrays;

import java.lang.Math;

public class Easy {
    public static int findLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }
}
