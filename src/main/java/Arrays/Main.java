package main.java.Arrays;

import main.java.Arrays.FindElementsInAnArray;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {8, 10, 5, 7, 9};
        int val1 = FindElementsInAnArray.getLargestElement(arr1);
        // System.out.println(val1);

        int[] arr2 = {1, 2, 4, 7, 7, 5};
        int val2 = FindElementsInAnArray.getSecondSmallestElement(arr2);
        int val3 = FindElementsInAnArray.getSecondLargestElement(arr2);
        // System.out.println(val3);

        int[] arr3 = {1, 2, 3, 4, 5};
        String val4 = FindElementsInAnArray.checkIfAnArrayIsSorted(arr3);
        // System.out.println(val4);

        int[] arr4 = {1, 1, 2, 2, 2, 3, 3};
        FindElementsInAnArray.removeDuplicatesInPlaceFromSortedArray(arr4);
        // for (int x : arr4) {
        //     System.out.println(x);
        // }

        int[] arr5 = {-1, 0, 3, 6};
        FindElementsInAnArray.leftRotateTheArrayByOne(arr5);
        // for (int x : arr5) {
        //     System.out.println(x);
        // }

        int[] arr6 = {1, 2, 3, 4, 5, 6};
        int k = 2;
        FindElementsInAnArray.rotateArrayByKElements(arr6, k);
        // for (int x : arr6) {
        //     System.out.println(x);
        // }

        int[] arr7 = {1, 0, 2, 3, 0, 4, 0, 1};
        FindElementsInAnArray.moveAllZeroesToTheEndOfTheArray(arr7);
        // for (int x : arr7) {
        //     System.out.println(x);
        // }

        int[] arr8 = {1, 2, 3, 5};
        int val5 = FindElementsInAnArray.findMissingNumber(arr8);
        System.out.println(val5);
    }
}
