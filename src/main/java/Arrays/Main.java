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
        // Find largest element in the array
        { 
            System.out.println("Find largest element in an array:");
            int[] arr = {5, 3, -1, 0, 10, 4};
            printArr(true, arr);
            System.out.printf("The largest element in the given array is: %d\n", Easy.findLargestElement(arr));
        } System.out.println();
    }
}
