package main.java.Sorting;

public class SelectionSort {

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void select(int[] arr, int start) {

        int minIdx = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx])
                minIdx = i;
        }

        if (minIdx != start)
            swap(arr, start, minIdx);
    }

    private static void recursiveSort(int[] arr, int start) {

        if (start >= arr.length - 1)
            return;

        select(arr, start);

        recursiveSort(arr, start + 1);
    }

    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, 0);
    }

    public static void iterativeSort(int[] arr) {

        for (int start = 0; start < arr.length - 1; start++)
            select(arr, start);
    }
}