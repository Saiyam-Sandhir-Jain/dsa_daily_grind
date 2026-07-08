package main.java.Arrays;

import main.java.Arrays.FindElementsInAnArray;
import main.java.Arrays.LeadersInAnArray;

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
        FindElementsInAnArray.leftRotateArrayByKElements(arr6, k);
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
        // System.out.println(val5);

        int[] arr9 = {2, 2, 1};
        int val6 = FindElementsInAnArray.findTheNumberThatAppearsOnce(arr9);
        // System.out.println(val6);

        int[] arr10 = {1, 2, 3, 4, 5, 6, 7};
        FindElementsInAnArray.leftRotateArrayByKElements(arr10, 3);
        // for (int x : arr10) {
        //     System.out.println(x);
        // }

        int[] arr11 = {1, 2, 3, 4, 5, 6, 7};
        FindElementsInAnArray.rightRotateArrayByKElements(arr11, 3);
        // for (int x : arr11) {
        //     System.out.println(x);
        // }

        int[] arr12 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr13 = {2, 3, 4, 4, 5, 11, 12};
        int[] union = FindElementsInAnArray.unionOfTwoSortedArrays(arr12, arr13);
        // for (int x : union) {
        //     System.out.println(x);
        // }

        int[] arr14 = {1, 1, 0, 0, 0, 1, 1, 1};
        int val7 = FindElementsInAnArray.countMaxConsecutiveOnes(arr14);
        // System.out.println(val7);

        int[] arr15 = {2, 6, 5, 8, 11};
        int target = 15;
        // if (MediumLevel.twoSum(arr15, target)) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }

        int[] arr16 = {1, 0, 2, 1, 0};
        MediumLevel.partitionArrayOf012(arr16);
        // for (int x : arr16) {
        //     System.out.println(x);
        // }

        int[] arr17 = {1, 1, 1, 2, 2};
        // System.out.println(MediumLevel.findMajorityOccuringElement(arr17));

        int[] arr18 = {2, -3, 4, 5};
        // System.out.println(MediumLevel.kadanesAlgo(arr18));

        int[] arr19 = {7, 6, 4, 3, 1};
        // MediumLevel.stockBuyAndSell(arr19);

        int[] arr20 = {6, 0, 12, 9, -1};
        // LeadersInAnArray.findLeaders(arr20);

        int[] arr21 = {6, 11, 13, 15, 20, 21};
        // System.out.println(FindElementsInAnArray.findNumberLessThanOrEqual(arr21,5));

        int[] arr22 = {3, -1, 10, 1, 9, 9, -1};
        FindElementsInAnArray.getMinMax(arr22);
    }
}
