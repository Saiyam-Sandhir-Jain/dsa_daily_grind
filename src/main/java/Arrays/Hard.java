package main.java.Arrays;

import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

public class Hard {
    public static int findLongestSubarrayLengthSum0(int[] arr) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);

        int rollingSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            rollingSum += arr[i];

            if (prefixMap.containsKey(rollingSum)) {
                maxLength = Math.max(maxLength, i - prefixMap.get(rollingSum));
            } else {
                prefixMap.put(rollingSum, i);
            }
        }

        return maxLength;
    }
}
