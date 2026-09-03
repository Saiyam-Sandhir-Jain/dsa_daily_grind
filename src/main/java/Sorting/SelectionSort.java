package main.java.Sorting;

public class SelectionSort {
    public static void iterative_sort(int[] arr) {
        if (arr.length <= 1)
            return;

        for (int p = 0; p < arr.length-1; p++) {
            int minValIdx = p;
            for (int i = minValIdx + 1; i < arr.length; i++) {
                if (arr[i] < arr[minValIdx])
                    minValIdx = i;
            } 
            
            if (minValIdx != p) 
                Utility.swap(arr, p, minValIdx);
        }
    }

    private static void recursive_sort(int[] arr, int p) {
        if (p >= arr.length-1)
            return;

        int minValIdx = p;
        for (int i = minValIdx + 1; i < arr.length; i++) {
            if (arr[i] < arr[minValIdx])
                minValIdx = i;
        }

        if (minValIdx != p)
            Utility.swap(arr, p, minValIdx);

        recursive_sort(arr, p+1);
    }

    public static void recursive_sort(int[] arr) {
        if (arr.length <= 1)
            return;

        recursive_sort(arr, 0);
    }
}