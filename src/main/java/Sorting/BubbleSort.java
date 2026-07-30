package main.java.Sorting;

public class BubbleSort {

    private static void swapPair(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    private static boolean bubblePass(int[] arr, int end) {

        boolean swapped = false;

        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[i + 1]) {
                swapPair(arr, i);
                swapped = true;
            }
        }

        return swapped;
    }

    private static void recursiveSort(int[] arr, int end) {

        if (end <= 0)
            return;

        if (!bubblePass(arr, end))
            return;

        recursiveSort(arr, end - 1);
    }

    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, arr.length - 1);
    }

    public static void iterativeSort(int[] arr) {

        for (int end = arr.length - 1; end > 0; end--) {

            if (!bubblePass(arr, end))
                return;
        }
    }
}