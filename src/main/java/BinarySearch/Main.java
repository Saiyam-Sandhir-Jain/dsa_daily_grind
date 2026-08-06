package main.java.BinarySearch;

class Solutions {
    public static void classic() {
        {
            int k = 5;
            int idx = Classic.firstOccurence(new int[]{1, 2, 3, 4, 5}, k);
            if (idx == -1) {
                System.out.printf("The given integer %d does not exist in the given array.\n", k);
            } else {
                System.out.printf("The first occurence of integer %d is at index %d of the given array.\n", k, idx);
            }
        }
        
    }

    public static void bound() {

    }

    public static void answers() {

    }

    public static void matrix() {

    }
}

public class Main {

    record Section(String title, Runnable action) {}

    private static void runSection(Section section) {
        System.out.println("##### Binary Search (" + section.title() + ") #####");
        section.action().run();
        System.out.println();
    }

    public static void main(String[] args) {
        Section[] sections = {
            new Section("Classic", Solutions::classic),
            new Section("Bound", Solutions::bound),
            new Section("Answers", Solutions::answers),
            new Section("Matrix", Solutions::matrix)
        };

        for (Section section : sections) {
            runSection(section);
        }
    }
}