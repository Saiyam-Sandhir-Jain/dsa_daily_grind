package main.java.Arrays;

import java.util.Deque;
import java.util.ArrayDeque;

public class Medium {
    public static void leadersInArray(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                stack.push(arr[i]);
            }
        } 
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        } System.out.println();
    }
}
