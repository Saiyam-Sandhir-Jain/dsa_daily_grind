package main.java.Backtracking;

import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

class TakeDontTake {

    class BinaryString {

        public static List<String> generateBinary(int n) {
            List<String> result = new ArrayList<>();

            backtracking(result, new StringBuilder(n), n);

            return result;
        }

        private static void backtracking(
                List<String> result,
                StringBuilder state,
                int n
        ) {
            if (n <= 0) {
                result.add(state.toString());
                return;
            }

            // Choose 0
            state.append('0');
            backtracking(result, state, n - 1);
            state.deleteCharAt(state.length() - 1);

            // Choose 1
            state.append('1');
            backtracking(result, state, n - 1);
            state.deleteCharAt(state.length() - 1);
        }
    }

    class Subsets {

        public static List<List<Integer>> generateSubsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            backtracking(
                    result,
                    new ArrayList<>(),
                    nums,
                    0
            );

            return result;
        }

        private static void backtracking(
                List<List<Integer>> result,
                List<Integer> state,
                int[] nums,
                int idx
        ) {
            if (idx == nums.length) {
                result.add(new ArrayList<>(state));
                return;
            }

            // Take nums[idx]
            state.add(nums[idx]);
            backtracking(result, state, nums, idx + 1);
            state.remove(state.size() - 1);

            // Do not take nums[idx]
            backtracking(result, state, nums, idx + 1);
        }
    }
}