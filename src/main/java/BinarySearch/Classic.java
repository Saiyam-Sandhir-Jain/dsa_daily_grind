package main.java.BinarySearch;

public class Classic {
    public static int firstOccurence(int[] arr, int k) {
        int l = 0, r = arr.length-1;
        while (l < r) {
            int mid = l + (r-l)/2;
            if (arr[mid] < k) {
                l = mid+1;
            } else {
                r = mid;
            }
        }

        if (arr[l] != k)
            return -1;

        return l;
    }
}
