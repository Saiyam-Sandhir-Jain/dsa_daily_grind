package Sorting;

public class BubbleSort {
    private static void swapPair(int[] arr, int x) {
        int y = x+1;
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }

    private static void recursiveSort(int[] arr, int k) {
        if (k < 1) return;

        boolean swapped = false;
        for (int i = 0, j = 1; j <= k-1; i++, j++) {
            if (arr[i] > arr[j]) {
                swapPair(arr, i);
                swapped = true;
            }
        } if (!swapped) return;

        recursiveSort(arr, k-1);
    }
    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, arr.length);
    }

    public static void iterativeSort(int[] arr) {
        if (arr.length <= 1) return;
        for (int k = arr.length; k >= 1; k--) {
            boolean swapped = false;
            for (int i = 0, j = 1; j <= k-1; i++, j++) {
                if (arr[i] > arr[j]) {
                    swapPair(arr, i);
                    swapped = true;
                }
            } if (!swapped) break;
        }
        
    }
}
