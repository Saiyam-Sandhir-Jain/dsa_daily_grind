package main.java.Arrays;

import java.lang.Math;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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

    public static boolean checkIfAsBeforeBs(String s) {
        if (s.length() <= 1) return true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && s.charAt(i-1) == 'b') return false;
        } return true;
    }

    public static boolean checkIfAscendingNumbersInString(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);

        int prev = Integer.MIN_VALUE;
        while (matcher.find()) {
            int curr = Integer.parseInt(matcher.group());
            if (curr < prev) return false;
            prev = curr;
        } return true;
    }

    public static int removeDuplicatedFromSortedArray(int[] arr) {
        int u = 1;
        for (int e = u; e < arr.length; e++) {
            if (arr[e] != arr[e-1])
                arr[u++] = arr[e]; 
        }

        return u;
    }
}
