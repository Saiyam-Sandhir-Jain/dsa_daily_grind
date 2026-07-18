package main.java.Sorting;

public class SelectionSort {
    private static void swap(int[] arr, int x, int y) {
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }

    private static void recursiveSort(int[] arr, int length, int u) {
        if (u >= length) return;
        int min = Integer.MAX_VALUE, minIdx = u;
        for (int e = u; e < length; e++) {
            if (arr[e] < min) {
                min = arr[e];
                minIdx = e;
            }
        } if (arr[minIdx] != arr[u]) swap(arr, u, minIdx);  // to prevent XOR swap destruction

        recursiveSort(arr, length, u+1);
    }

    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, arr.length, 0);
    }

    public static void iterativeSort(int[] arr) {
        int u = -1, e;
        while (++u < arr.length) {
            int min = Integer.MAX_VALUE, minIdx = u;
            for (e = u; e < arr.length; e++) {
                if (arr[e] < min) {
                    min = arr[e];
                    minIdx = e;
                } 
            } if (arr[minIdx] != arr[u]) swap(arr, u, minIdx); // to prevent XOR swap destruction
        }
    }
}
