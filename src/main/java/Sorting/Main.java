package main.java.Sorting;

import java.lang.StringBuilder;

public class Main {
    private static void printArr(boolean sorted, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + " ");
        }

        if (!sorted) {
            System.out.print("Array before sorting: ");
        } else {
            System.out.print("Array after sorting: ");
        } System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Selection Sort => Iterative
        {
            System.out.println("Selection Sort: Iterative");
            int[] arr = {5, 4, 7, 8, 9};
            printArr(false, arr);
            SelectionSort.iterativeSort(arr);
            printArr(true, arr);
        } System.out.println();

        // Selection Sort => Recursive
        {
            System.out.println("Selection Sort: Recursive");
            int[] arr = {5, 4, 8, 9, 0};
            printArr(false, arr);
            SelectionSort.recursiveSort(arr);
            printArr(true, arr);
        } System.out.println();

        // Bubble Sort => Iterative
        {
            System.out.println("Bubble Sort: Iterative");
            int[] arr = {6, 4, 6, 0, 9};
            printArr(false, arr);
            BubbleSort.iterativeSort(arr);
            printArr(true, arr);
        } System.out.println();

        // Bubble Sort => Recursive
        {
            System.out.println("Bubble Sort: Recursive");
            int[] arr = {9, 8, 7, 6};
            printArr(false, arr);
            BubbleSort.recursiveSort(arr);
            printArr(true, arr);
        } System.out.println();

        // Bubble Sort => Iterative
        {
            System.out.println("Insertion Sort: Iterative");
            int[] arr = {6, 4, 6, 0, 9};
            printArr(false, arr);
            InsertionSort.iterativeSort(arr);
            printArr(true, arr);
        } System.out.println();

        // Insertion Sort => Recursive
        {
            System.out.println("Insertion Sort: Recursive");
            int[] arr = {9, 8, 7, 6};
            printArr(false, arr);
            InsertionSort.recursiveSort(arr);
            printArr(true, arr);
        } System.out.println();
    }
}
