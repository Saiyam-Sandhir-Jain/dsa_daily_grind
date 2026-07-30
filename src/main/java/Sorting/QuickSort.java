package main.java.Sorting;

import java.util.Stack;

public class QuickSort {

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while (true) {

            while (i <= end && arr[i] < pivot)
                i++;

            while (j > start && arr[j] > pivot)
                j--;

            if (i >= j)
                break;

            swap(arr, i, j);
            i++;
            j--;
        }

        swap(arr, start, j);
        return j;
    }

    private static void recursiveSort(int[] arr, int start, int end) {

        if (start >= end)
            return;

        int p = partition(arr, start, end);

        recursiveSort(arr, start, p - 1);
        recursiveSort(arr, p + 1, end);
    }

    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, 0, arr.length - 1);
    }

    public static void iterativeSort(int[] arr) {

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {

            int[] range = stack.pop();

            int start = range[0];
            int end = range[1];

            if (start >= end)
                continue;

            int p = partition(arr, start, end);

            stack.push(new int[]{start, p - 1});
            stack.push(new int[]{p + 1, end});
        }
    }
}