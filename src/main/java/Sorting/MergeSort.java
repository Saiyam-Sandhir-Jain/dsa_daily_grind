package main.java.Sorting;

public class MergeSort {

    private static void merge(int[] arr, int s, int mid, int e) {

        int[] rightHalf = new int[e - mid];
        System.arraycopy(arr, mid + 1, rightHalf, 0, e - mid);

        int lPtr = mid;
        int rPtr = rightHalf.length - 1;
        int updater = e;

        while (lPtr >= s && rPtr >= 0) {

            if (rightHalf[rPtr] >= arr[lPtr]) {
                arr[updater--] = rightHalf[rPtr--];
            } else {
                arr[updater--] = arr[lPtr--];
            }
        }

        while (rPtr >= 0) {
            arr[updater--] = rightHalf[rPtr--];
        }
    }

    private static void recursiveSort(int[] arr, int s, int e) {

        if (s >= e)
            return;

        int mid = s + (e - s) / 2;

        recursiveSort(arr, s, mid);
        recursiveSort(arr, mid + 1, e);

        merge(arr, s, mid, e);
    }

    public static void recursiveSort(int[] arr) {
        recursiveSort(arr, 0, arr.length - 1);
    }

    public static void iterativeSort(int[] arr) {

        int n = arr.length;

        for (int size = 1; size < n; size *= 2) {

            for (int left = 0; left < n; left += 2 * size) {

                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);

                if (mid < right)
                    merge(arr, left, mid, right);
            }
        }
    }
}