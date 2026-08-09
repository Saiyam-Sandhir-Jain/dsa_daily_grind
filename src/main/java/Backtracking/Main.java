package main.java.Backtracking;

import java.util.List;
import java.util.Arrays;

class Solutions {

    public static void takeDontTake() {

        // Q1. Generate Binary Strings
        {
            System.out.println("Q1. Generate Binary Strings:");

            int n = 5;

            List<String> result =
                    TakeDontTake.BinaryString.generateBinary(n);

            System.out.println("n = " + n);
            System.out.println("Binary Strings: " + result);
        }
        System.out.println();

        // Q2. Generate Subsets (Leetcode 78)
        {
            System.out.println("Q2. Generate Subsets:");

            int[] nums = {1, 2, 3};

            List<List<Integer>> result =
                    TakeDontTake.Subsets.generateSubsets(nums);

            System.out.println("Input: " + Arrays.toString(nums));
            System.out.println("Subsets: " + result);
        }
        System.out.println();
    }

    public static void combinations() {

        // Q1. Generate Combinations from Array
        {
            System.out.println("Q1. Generate Combinations from Array:");

            int[] nums = {1, 2, 3, 4};
            int r = 2;

            List<List<Integer>> result =
                    Combinations.generateCombinations(nums, r);

            System.out.println("Input: " + Arrays.toString(nums));
            System.out.println("r = " + r);
            System.out.println("Combinations: " + result);
        }
        System.out.println();

        // Q2. Generate Combinations from 1 to n (leetcode: 77)
        {
            System.out.println("Q2. Generate Combinations from 1 to n:");

            int n = 4;
            int r = 2;

            List<List<Integer>> result =
                    Combinations.generateCombinations(n, r);

            System.out.println("n = " + n);
            System.out.println("r = " + r);
            System.out.println("Combinations: " + result);
        }
        System.out.println();
    }
}


public class Main {

    record Section(String title, Runnable action) {}

    private static void runSection(Section section) {
        System.out.println(
                "##### Backtracking (" + section.title() + ") #####"
        );

        section.action().run();

        System.out.println();
    }

    public static void main(String[] args) {

        Section[] sections = {

            new Section(
                    "Take or Don't Take",
                    Solutions::takeDontTake
            ),

            new Section(
                    "Combinations",
                    Solutions::combinations
            )
        };

        for (Section section : sections) {
            runSection(section);
        }
    }
}