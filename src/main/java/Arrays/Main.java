package main.java.Arrays;

public class Main {
    private static void printArr(boolean defaultMsg, int[] arr) {
        if (defaultMsg) {
            System.out.print("The given array is: ");
        }

        for (int i : arr) {
            System.out.print(i + " ");
        } System.out.println();
    }
    public static void main(String[] args) {
        // Find largest element in an array
        { 
            System.out.println("Find largest element in an array:");
            int[] arr = {5, 3, -1, 0, 10, 4};
            printArr(true, arr);
            System.out.printf("The largest element in the given array is: %d\n", Easy.findLargestElement(arr));
        } System.out.println();

        // Find second largest element in an array
        {
            System.out.println("Find second largest element in an array:");
            int[] arr = {5, 3, -1, 0, 10, 4};
            printArr(true, arr);
            System.out.printf("The second largest element in the given array is: %d\n", Easy.findSecondLargestElement(arr));
        } System.out.println();

        // Check if an array is sorted and rotated (leetcode: 1752)
        {
            System.out.println("Check if an array is sorted and rotated:");
            int[] arr = {1, 2, 0, -1, 0};
            printArr(true, arr);
            String msg = (Easy.checkIfSortedII(arr)) ? "The given array is sorted and rotated" : "The given array is not sorted and rotated";
            System.out.println(msg);
        } System.out.println();
    }
}
