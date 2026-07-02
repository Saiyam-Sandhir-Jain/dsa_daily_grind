package main.java.Arrays;

import java.util.Arrays;

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

    public static String checkIfAnArrayIsSorted(int[] arr) {
        if (arr.length <= 1) return "Sorted";
        for (int i = 0, j = 1; j < arr.length; ++i, ++j) {
            if (arr[i] > arr[j]) return "Not Sorted";
        } return "Sorted";
    }

    public static void removeDuplicatesInPlaceFromSortedArray(int[] arr) {
        if (arr.length <= 1) {
            System.out.printf("k = %d\n", arr.length);
            return;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        } System.out.printf("k = %d\n", (i+1));
    }

    public static void leftRotateTheArrayByOne(int[] arr) {
        int length = arr.length;
        if (length == 0) return;
        int temp = arr[0];
        for (int i = 1; i < length; ++i) {
            arr[i-1] = arr[i];
        } arr[length-1] = temp;
    }

    public static void rotateArrayByKElements(int[] arr, int k) {
        if (arr.length < k) return;
        int[] temp = Arrays.copyOfRange(arr, 0, k);
        for (int i = k; i < arr.length; ++i) {
            arr[i-k] = arr[i];
        } System.arraycopy(temp, 0, arr, arr.length-k, k);
    }
}

