package main.java.Backtracking;

import java.util.List;
import java.util.ArrayList;

class Combinations {

    public static List<List<Integer>> generateCombinations(
            int[] nums,
            int r
    ) {
        List<List<Integer>> result = new ArrayList<>();

        backtracking(
                result,
                new ArrayList<>(),
                nums,
                0,
                r
        );

        return result;
    }

    public static List<List<Integer>> generateCombinations(
            int n,
            int r
    ) {
        int[] nums = new int[n];

        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }

        return generateCombinations(nums, r);
    }

    private static void backtracking(
            List<List<Integer>> result,
            List<Integer> state,
            int[] nums,
            int idx,
            int r
    ) {
        // Successfully selected r elements
        if (r == 0) {
            result.add(new ArrayList<>(state));
            return;
        }

        // Ran out of elements before selecting r
        if (idx >= nums.length) {
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            state.add(nums[i]);

            backtracking(
                    result,
                    state,
                    nums,
                    i + 1,
                    r - 1
            );

            state.remove(state.size() - 1);
        }
    }
}