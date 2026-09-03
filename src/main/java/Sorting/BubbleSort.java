package main.java.Sorting;

public class BubbleSort {
    public static void iterative_sort(int[] arr) {
        if (arr.length <= 1)
            return;
        
        for (int end = arr.length; end > 1; end--) {
            boolean swapped = false;
            for (int j = 1; j < end; j++) {
                if (arr[j] < arr[j-1]) {
                    Utility.swap(arr, j, j-1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    private static void recursive_sort(int[] arr, int end) {
        if (end <= 1)
            return;

        boolean swapped = false;
        for (int i = 1; i < end; i++) {
            if (arr[i] < arr[i-1]) {
                Utility.swap(arr, i, i-1);
                swapped = true;
            }
        }

        if (!swapped)
            return;

        recursive_sort(arr, end-1);
    }

    public static void recursive_sort(int[] arr) {
        if (arr.length <= 1)
            return;

        recursive_sort(arr, arr.length);
    }
}