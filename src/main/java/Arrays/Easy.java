package main.java.Arrays;

import java.lang.Math;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Easy {
    public static int findLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }

    public static int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }

        return secondLargest;
    }

    public static boolean checkIfSortedII(int[] arr) {
        if (arr.length <= 2) return true;

        int count = 0, i = 1;
        while (i < arr.length) {
            if (arr[i-1] > arr[i]) count++;
            if (count > 1) return false;
            i++;
        } if (arr[i-1] > arr[0]) count++;

        if (count > 1) return false;
        return true;
    }

    public static boolean checkIfAsBeforeBs(String s) {
        if (s.length() <= 1) return true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && s.charAt(i-1) == 'b') return false;
        } return true;
    }

    public static boolean checkIfAscendingNumbersInString(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);

        int prev = Integer.MIN_VALUE;
        while (matcher.find()) {
            int curr = Integer.parseInt(matcher.group());
            if (curr < prev) return false;
            prev = curr;
        } return true;
    }

    public static int removeDuplicatedFromSortedArray(int[] arr) {
        int u = 1;
        for (int e = u; e < arr.length; e++) {
            if (arr[e] != arr[e-1])
                arr[u++] = arr[e]; 
        }

        return u;
    }

    private static void reverse(int[] arr, int x, int y) {
        while (x < y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++; y--;
        }
    }
    public static void rotateArrayByKPlaces(int[] arr, int k) {
        int n = arr.length;
        while (k < 0)
            k = n + k;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void moveAllZerosToEnd(int[] arr) {
        int u = 0;
        for (int e = u; e < arr.length; e++) {
            if (arr[e] != 0) arr[u++] = arr[e];
        }

        while (u < arr.length) {
            arr[u++] = 0;
        }
    }

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }

        return -1;
    }

    public static int[] unionOfSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int expectedSum = (n*(n+1))/2;
        int sum = 0;
        for (int i : arr) 
            sum += i;
        return expectedSum-sum;
    }

    public static int longestSubarrayLengthSumK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int rollingSum = 0, maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            rollingSum += arr[i];
            int target = rollingSum - k;

            if (map.containsKey(target)) {
                maxLength = Math.max(maxLength, i-map.get(target));
            }

            map.putIfAbsent(rollingSum, i);
        }

        return maxLength;
    }
} 
