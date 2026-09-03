package main.java.Sorting;

import java.lang.StringBuilder;

public class Utility {
    public static String arrayString(int[] arr) {
        if (arr == null)
            return "null";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                sb.append(", ");

            sb.append(arr[i]);
        }

        sb.append("]");
        return sb.toString();
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
