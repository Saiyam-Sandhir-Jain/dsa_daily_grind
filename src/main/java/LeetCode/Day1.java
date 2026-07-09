package main.java.LeetCode;

import java.util.Map;
import java.util.HashMap;

class Problems {
    public static void twoSum(int[] arr, int target) {
        System.out.print("The required to indices are: ");
        Map<Integer, Integer> history = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; ++i) {
            int reqVal = target-arr[i];
            if (history.containsKey(reqVal)) {
                System.out.printf("(%d, %d)\n", i, history.get(reqVal));
            } history.put(arr[i], i);
        }
    }
}

public class Day1 {
    public static void main() {
        System.out.println("Day1 Solutions:-\n");

        // 1. Two Sum
        {
            System.out.println("1. Two Sum");
            int[] arr = {3, 2, 4};
            int target = 6;
            Problems.twoSum(arr, target);
        } System.out.println();

        
    }
}
