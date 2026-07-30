package main.java.Sorting;

public class InsertionSort {

    private static void insert(int[] arr, int idx) {

        int temp = arr[idx];
        int j = idx;

        while (j > 0 && arr[j - 1] > temp) {
            arr[j] = arr[j - 1];
            j--;
        }

        arr[j] = temp;
    }

    private static void recursiveSort(int[] arr, int idx) {

        if (idx >= arr.length)
            return;

        insert(arr, idx);

        recursiveSort(arr, idx + 1);
    }

    public static void recursiveSort(int[] arr) {

        if (arr.length <= 1)
            return;

        recursiveSort(arr, 1);
    }

    public static void iterativeSort(int[] arr) {

        for (int i = 1; i < arr.length; i++)
            insert(arr, i);
    }
}