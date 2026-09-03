package main.java.Sorting;

public class InsertionSort {

    public static void iterative_sort(int[] arr) {

        if (arr.length <= 1)
            return;

        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    private static void recursive_sort(int[] arr, int i) {

        if (i >= arr.length)
            return;

        int j = i - 1;
        int temp = arr[i];

        while (j >= 0 && arr[j] > temp) {

            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = temp;

        recursive_sort(arr, i + 1);
    }

    public static void recursive_sort(int[] arr) {

        if (arr.length <= 1)
            return;

        recursive_sort(arr, 1);
    }
}