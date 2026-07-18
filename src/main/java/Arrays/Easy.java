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

    public static int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }

        return secondLargest;
    }

    public static boolean checkIfSortedII(int[] arr) {
        if (arr.length <= 2) return true;

        int count = 0, i = 1;
        while (i < arr.length) {
            if (arr[i-1] > arr[i]) count++;
            if (count > 1) return false;
            i++;
        } if (arr[i-1] > arr[0]) count++;

        if (count > 1) return false;
        return true;
    }
}
