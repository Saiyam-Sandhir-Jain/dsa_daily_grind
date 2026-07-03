package main.java.Strings;

import java.util.*;

public class ReverseAlternateWords {
    private static StringBuilder reverseWord(String w) {
        StringBuilder sb = new StringBuilder();
        int length = w.length();
        int i = 0, j = length-1;
        char[] word = w.toCharArray();
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;   
            i++; j--;
        }

        for (char x : word) {
            sb.append(x);
        }

        return sb;
    }

    public static String reverseAlternateWords(String s) {
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) sb.append(reverseWord(words[i]));
            else sb.append(" " + words[i] + " ");
        }

        return sb.toString();
    }
}
