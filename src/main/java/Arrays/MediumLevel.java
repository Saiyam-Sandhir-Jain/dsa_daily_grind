package main.java.Arrays;

import java.util.HashMap;

public class MediumLevel {
    public static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mem = new HashMap<>();
        mem.put(arr[0], 0);
        for (int i = 1; i < arr.length; ++i) {
            int reqValue = target - arr[i];
            if (mem.containsKey(reqValue)) return true;
            else mem.put(arr[i], i);
        } return false;
    }

    private static void swap(int arr[], int x, int y) {
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }

    public static void partitionArrayOf012(int[] arr) {
        int l = 0, r = arr.length-1, curr = 0;
        while(curr <= r) {
            if (arr[curr] == 0) {
                swap(arr, l++, curr++);
            } else if (arr[curr] == 2) {
                swap(arr, curr, r--);
            } else curr++;
        }   
    }
}
