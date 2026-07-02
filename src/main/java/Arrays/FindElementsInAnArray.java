package main.java.Arrays;

public class FindElementsInAnArray {
    public static int getLargestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > largestElement) largestElement = arr[i];
        }
        return largestElement;
    }

    public static int getSecondSmallestElement(int[] arr) {
        int min = Integer.MAX_VALUE, sMin = -1;
        if (arr.length == 1) return -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                sMin = min;
                min = arr[i];
            }
        }
        
        return sMin;
    }

    public static int getSecondLargestElement(int[] arr) {
        int max = -1, sMax = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }
            if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }

        return sMax;
    }
}
