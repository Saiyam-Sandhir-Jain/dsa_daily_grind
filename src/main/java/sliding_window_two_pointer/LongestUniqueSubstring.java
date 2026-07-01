package main.java.sliding_window_two_pointer;

import java.util.Arrays;

public class LongestUniqueSubstring {
    public static int lengthOfLongestUniqueSubstring(String s) {
        boolean[] hash = new boolean[26];
        int r = 0;
        int maxLength = 0, length = 0;
        while (r < s.length()) {
            int charIndex = s.charAt(r)-97;
            if (hash[charIndex]) {
                if (length > maxLength) {
                    maxLength = length;
                }
                Arrays.fill(hash, false);
                length = 0;
            }
            hash[charIndex] = true;
            length++;
            r++;
        }
        return maxLength;
    }
}