package main.java.Sorting;


class Solutions {
        public static void bubbleSort() {
                // Iterative Sort
                {
                        int[] arr = {10, -1, 9, 8, 11, 4, 0};

                        System.out.printf(
                                "The given array is: %s\n",
                                Utility.arrayString(arr)
                        );

                        BubbleSort.iterative_sort(arr);

                        System.out.printf(
                                "The array after iterative bubble sort: %s\n",
                                Utility.arrayString(arr)
                        );
                }
                System.out.println();

                // Recursive Sort
                {
                        int[] arr = {10, -1, 9, 8, 11, 4, 0};

                        System.out.printf(
                                "The given array is: %s\n",
                                Utility.arrayString(arr)
                        );

                        BubbleSort.recursive_sort(arr);

                        System.out.printf(
                                "The array after recursive bubble sort: %s\n",
                                Utility.arrayString(arr)
                        );
                }

        }

        public static void selectionSort() {
                // Iterative Sort
                {
                        int[] arr = {10, -1, 9, 8, 11, 4, 0};

                        System.out.printf(
                                "The given array is: %s\n",
                                Utility.arrayString(arr)
                        );

                        SelectionSort.iterative_sort(arr);

                        System.out.printf(
                                "The array after iterative selection sort: %s\n",
                                Utility.arrayString(arr)
                        );
                }
                System.out.println();

                // Recursive Sort
                {
                        int[] arr = {10, -1, 9, 8, 11, 4, 0};

                        System.out.printf(
                                "The given array is: %s\n",
                                Utility.arrayString(arr)
                        );

                        SelectionSort.recursive_sort(arr);

                        System.out.printf(
                                "The array after recursive selection sort: %s\n",
                                Utility.arrayString(arr)
                        );
                }
        }

        public static void insertionSort() {

        }

        public static void mergeSort() {

        }

        public static void quickSort() {

        }
}

public class Main {
        record Section(String title, Runnable action) {}

        private static void runSection(Section section) {
                System.out.printf("##### %s #####\n", section.title());
                section.action().run();
                System.out.println();
        }

        public static void main(String[] args) {
                Section[] sections = {
                        new Section("Bubble Sort", Solutions::bubbleSort),
                        new Section("Selection Sort", Solutions::selectionSort),
                        new Section("Insertion Sort", Solutions::insertionSort),
                        new Section("Merge Sort", Solutions::mergeSort),
                        new Section("Quick Sort", Solutions::quickSort)
                };

                for (Section section : sections)
                        runSection(section);
        }
}