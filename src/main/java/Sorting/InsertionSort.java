package main.java.Sorting;

public class InsertionSort {
    private static void recursiveSort(int[] arr, int length, int i) {
        if (i >= length) return;

        int temp = arr[i], j = i;
        while (j > 0 && arr[j-1] > temp) {
            arr[j] = arr[j-1];
            j--;
        } arr[j] = temp;

        recursiveSort(arr, length, i+1);
    }
    public static void recursiveSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return;
        recursiveSort(arr, length, 1);
    }

    public static void iterativeSort(int[] arr) {
        if (arr.length <= 1) return;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }
    }
}