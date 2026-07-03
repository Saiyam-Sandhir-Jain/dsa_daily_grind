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

    public static void moveAllZeroesToTheEndOfTheArray(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        for (; i < arr.length; ++i) {
            arr[i] = 0;
        }
    }

    public static int findMissingNumber(int[] arr) {
        int length = arr.length;
        int expectedSum = (length+1)*(length+2)/2;
        int sum = 0;
        for (int i = 0; i < length; ++i) {
            sum += arr[i];
        }
        return expectedSum-sum;
    }

    public static int findTheNumberThatAppearsOnce(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; ++i) {
            num ^= arr[i];
        }
        return num;
    }

    private static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++; end--;
        }
    }

    public static void leftRotateArrayByKElements(int[] arr, int k) {
        reverseSubArray(arr, 0, k-1);
        reverseSubArray(arr, k, arr.length-1);
        reverseSubArray(arr, 0, arr.length-1);
    }

    public static void rightRotateArrayByKElements(int[] arr, int k) {
        reverseSubArray(arr, 0, arr.length-1);
        reverseSubArray(arr, 0, k-1);
        reverseSubArray(arr, k, arr.length-1);
    }

    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        union[k] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == union[k]) i++;
            else if (arr2[j] == union[k]) j++;
            else union[++k] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length) {
            union[++k] = arr1[i++];
        }
        while (j < arr2.length) {
            union[++k] = arr2[j++];
        }

        return union;
    }
}

