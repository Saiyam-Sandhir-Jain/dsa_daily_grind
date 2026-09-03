package main.java.Sorting;

class Solutions {
        public static void bubbleSort() {

        }

        public static void insertionSort() {

        }

        public static void mergeSort() {

        }

        public static void quickSort() {

        }

        public static void selectionSort() {

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