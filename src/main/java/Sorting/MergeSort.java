package main.java.Sorting;

public class MergeSort {
    private static void recursiveSort(int[] arr, int s, int e) {
        if (s >= e)
            return;

        int mid = s+((e-s)/2);

        recursiveSort(arr, s, mid);
        recursiveSort(arr, mid+1, e);

        int rightSize = e - mid;
        int[] rightHalf = new int[rightSize];
        System.arraycopy(arr, mid + 1, rightHalf, 0, rightSize);

        int lHalfPointer = mid, rHalfPointer = rightHalf.length-1;
        int updater = e;
        while (rHalfPointer > -1 && lHalfPointer > s-1 && updater > -1) {
            if (rightHalf[rHalfPointer] >= arr[lHalfPointer]) {
                arr[updater] = rightHalf[rHalfPointer--];
            } else {
                arr[updater] = arr[lHalfPointer--];
            } updater--;
        }

        while (rHalfPointer > -1 && updater > -1) {
            arr[updater] = rightHalf[rHalfPointer--];
            updater--;
        }
    }
    public static void recursiveSort(int[] arr) {
        int s = 0, e = arr.length-1;
        recursiveSort(arr, s, e);
    }

    private static void iterativeSort(int[] arr, int s, int mid, int e) {
        int rightSize = e - mid;
        int[] rightHalf = new int[rightSize];

        System.arraycopy(arr, mid + 1, rightHalf, 0, rightSize);

        int lHalfPointer = mid;
        int rHalfPointer = rightHalf.length - 1;
        int updater = e;

        while (lHalfPointer >= s && rHalfPointer >= 0) {
            if (rightHalf[rHalfPointer] >= arr[lHalfPointer]) {
                arr[updater--] = rightHalf[rHalfPointer--];
            } else {
                arr[updater--] = arr[lHalfPointer--];
            }
        }

        while (rHalfPointer >= 0) {
            arr[updater--] = rightHalf[rHalfPointer--];
        }
    }
    public static void iterativeSort(int[] arr) {
        int n = arr.length;

        // Current size of subarrays to merge
        for (int size = 1; size < n; size *= 2) {

            // Pick starting point of every pair
            for (int left = 0; left < n; left += 2 * size) {

                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);

                // No right half exists
                if (mid >= right)
                    continue;

                iterativeSort(arr, left, mid, right);
            }
        }
    }
}
