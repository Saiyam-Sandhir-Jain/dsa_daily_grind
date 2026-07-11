package main.java.LeetCode;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Arrays;

class Problems {
    public static void topKFrequentWords(String[] words, int k) {
        Map<String, Integer> freqMap = new HashMap<>(words.length);
        for (String s : words) {
            freqMap.put(s, freqMap.getOrDefault(s, 0)+1);
        }

        Queue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, (a, b) -> { 
                                                                                        if (a.getValue() != b.getValue()) {
                                                                                            return a.getValue()-b.getValue();
                                                                                        } return b.getKey().compareTo(a.getKey());
                                                                                    });
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        } System.out.println();
    }

    public static void maximumUnitsOnATruck(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);

        int totalUnits = 0;
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int numberOfBoxes = boxTypes[i][0];
            if (numberOfBoxes > truckSize) {
                totalUnits += truckSize*boxTypes[i][1];
                truckSize = 0;
            } else {
                totalUnits += numberOfBoxes*boxTypes[i][1];
                truckSize -= numberOfBoxes;
            }
        }

        System.out.println(totalUnits);
    }

    public static void largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: all zeros
        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}

public class Day2 {
    public static void main() {
        System.out.println("Day2 Solutions:-\n");

        // 692. Top K Frequent Words
        {
            System.out.println("692. Top K Frequent Words");
            String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
            int k = 4;
            System.out.printf("The top %d most frequent words are: ", k);
            Problems.topKFrequentWords(words, k);
        } System.out.println();

        // 1710. Maximum Units on a Truck
        {
            System.out.println("1710. Maximum Units on a Truck");
            int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
            int truckSize = 4;
            System.out.print("The maximum number of units that can be loaded on the truck is: ");
            Problems.maximumUnitsOnATruck(boxTypes, truckSize);
        } System.out.println();

        // 179. Largest Number
        {
            System.out.println("179. Largest Number");
            int[] nums = {3, 30, 34, 5, 9};
            System.out.printf("The largest number formed: ");
        } System.out.println();
    }
}
