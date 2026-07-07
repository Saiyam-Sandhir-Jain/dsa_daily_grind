package main.java.Arrays;

public class LeadersInAnArray {
    public static void findLeaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
