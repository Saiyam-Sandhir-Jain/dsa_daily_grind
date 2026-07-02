package main.java.Arrays;

import main.java.Arrays.FindElementsInAnArray;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {8, 10, 5, 7, 9};
        int val1 = FindElementsInAnArray.getLargestElement(arr1);
        System.out.println(val1);

        int[] arr2 = {1, 2, 4, 7, 7, 5};
        int val2 = FindElementsInAnArray.getSecondSmallestElement(arr2);
        int val3 = FindElementsInAnArray.getSecondLargestElement(arr2);
        System.out.println(val3);
    }
}
