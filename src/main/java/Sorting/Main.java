package main.java.Sorting;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    private static void printArr(int[] arr, Consumer<int[]> sortingFunction) {
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sortingFunction.accept(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {

        // Selection Sort
        {
            System.out.println("Selection Sort: Iterative");
            printArr(new int[]{5, 4, 7, 8, 9},
                    arr -> SelectionSort.iterativeSort(arr));

            System.out.println("Selection Sort: Recursive");
            printArr(new int[]{5, 4, 8, 9, 0},
                    arr -> SelectionSort.recursiveSort(arr));
        }
        
        // Bubble Sort
        {
            System.out.println("Bubble Sort: Iterative");
            printArr(new int[]{6, 4, 6, 0, 9},
                    arr -> BubbleSort.iterativeSort(arr));

            System.out.println("Bubble Sort: Recursive");
            printArr(new int[]{9, 8, 7, 6},
                    arr -> BubbleSort.recursiveSort(arr));
        }
        
        // Insertion Sort
        {
            System.out.println("Insertion Sort: Iterative");
            printArr(new int[]{6, 4, 6, 0, 9},
                    arr -> InsertionSort.iterativeSort(arr));

            System.out.println("Insertion Sort: Recursive");
            printArr(new int[]{9, 8, 7, 6},
                    arr -> InsertionSort.recursiveSort(arr));
        }

        // Merge Sort
        {
            System.out.println("Merge Sort: Iterative");
            printArr(new int[]{10, 9, 8, 5, 6, 7},
                    arr -> MergeSort.iterativeSort(arr));

            System.out.println("Merge Sort: Recursive");
            printArr(new int[]{3, 4, 5, 1, 2, 3},
                    arr -> MergeSort.recursiveSort(arr));
        }

        // Quick Sort
        {
            System.out.println("Quick Sort: Iterative");
            printArr(new int[]{1, 0, 2, 9, 3, 8, 4, 8},
                    arr -> QuickSort.recursiveSort(arr));

            System.out.println("Quick Sort: Recursive");
            printArr(new int[]{1, 0, 2, 9, 3, 8, 4, 8},
                    arr -> QuickSort.recursiveSort(arr));
        } 
        
    }
}