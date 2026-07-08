package main.java.Arrays;

import java.util.Arrays;
import java.lang.Math;
import java.util.Collections;

public class FindElementsInAnArray {
    public static int getLargestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > largestElement) largestElement = arr[i];
        }
        return largestElement;
    }

    public static int getSecondSmallestElement(int[] arr) {
        int min = Integer.MAX_VALUE, sMin = -1;
        if (arr.length == 1) return -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                sMin = min;
                min = arr[i];
            }
        }
        
        return sMin;
    }

    public static int getSecondLargestElement(int[] arr) {
        int max = -1, sMax = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }
            if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }

        return sMax;
    }

    public static String checkIfAnArrayIsSorted(int[] arr) {
        if (arr.length <= 1) return "Sorted";
        for (int i = 0, j = 1; j < arr.length; ++i, ++j) {
            if (arr[i] > arr[j]) return "Not Sorted";
        } return "Sorted";
    }

    public static void removeDuplicatesInPlaceFromSortedArray(int[] arr) {
        if (arr.length <= 1) {
            System.out.printf("k = %d\n", arr.length);
            return;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        } System.out.printf("k = %d\n", (i+1));
    }

    public static void leftRotateTheArrayByOne(int[] arr) {
        int length = arr.length;
        if (length == 0) return;
        int temp = arr[0];
        for (int i = 1; i < length; ++i) {
            arr[i-1] = arr[i];
        } arr[length-1] = temp;
    }

    public static void moveAllZeroesToTheEndOfTheArray(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        for (; i < arr.length; ++i) {
            arr[i] = 0;
        }
    }

    public static int findMissingNumber(int[] arr) {
        int length = arr.length;
        int expectedSum = (length+1)*(length+2)/2;
        int sum = 0;
        for (int i = 0; i < length; ++i) {
            sum += arr[i];
        }
        return expectedSum-sum;
    }

    public static int findTheNumberThatAppearsOnce(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; ++i) {
            num ^= arr[i];
        }
        return num;
    }

    private static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++; end--;
        }
    }

    public static void leftRotateArrayByKElements(int[] arr, int k) {
        reverseSubArray(arr, 0, k-1);
        reverseSubArray(arr, k, arr.length-1);
        reverseSubArray(arr, 0, arr.length-1);
    }

    public static void rightRotateArrayByKElements(int[] arr, int k) {
        reverseSubArray(arr, 0, arr.length-1);
        reverseSubArray(arr, 0, k-1);
        reverseSubArray(arr, k, arr.length-1);
    }

    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        union[k] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == union[k]) i++;
            else if (arr2[j] == union[k]) j++;
            else union[++k] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length) {
            union[++k] = arr1[i++];
        }
        while (j < arr2.length) {
            union[++k] = arr2[j++];
        }

        return union;
    }

    public static int countMaxConsecutiveOnes(int[] arr) {
        int currStreak = 0, maxStreak = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 1) currStreak++;
            else {
                if (maxStreak < currStreak) {
                    maxStreak = currStreak;
                    currStreak = 0;
                }
            } i++;
        } 
        return currStreak > maxStreak ? currStreak : maxStreak;
    }

    // public static int[] findLongestSubarrayWithGivenSumK(int[] arr, int k) {
    //     int l = 0, r = 0;
    //     int sum = arr[r++];
    //     while (l <= r && r < arr.length) {
    //         if (sum <= k) {
    //         sum += arr[r++];
    //         }
    //         if (sum > k) {
    //             sum -= arr[l--];
    //         }
    //     }
    // }

    public static int findNumberLessThanOrEqual(int[] arr, int k) {
        int start = 0, end = arr.length-1, mid = start+end/2;
        
        while (start < end) {
            if (arr[mid] <= k) {
                start = mid+1;
                mid = start+end/2;
            } else {
                end = mid-1;
                mid = start+end/2;
            }
        }
        
        return end+1;
    }

    // public static int findTheLengthOfLongestSwitchingSubarray(int[] arr) {
    //     if (arr.length == 0) return 0;
    //     int e = 0, o = 1;
    //     int rollingLength = 0;
    //     while (e < arr.length) {
    //         if (e%2 == 0 && arr[e]%2 == 0) {
    //             rollingLength++;
    //         }
    //         if (o < arr.length && o%2 != 0 && arr[o]%2 != 0) {
    //             rollingLength++;
    //         }
    //         e+=2;
    //         o+=2;
    //     }
        
        
    // }

    public static void getMinMax(int[] arr) {
        int e1 = 0, e2 = 1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (e1 < arr.length) {
            if (e1 < arr.length) {
                min = Math.min(min, arr[e1]);
                max = Math.max(max, arr[e1]);
            }
            if (e2 < arr.length) {
                min = Math.min(min, arr[e2]);
                max = Math.max(max, arr[e2]);
            }
            e1+=2;
            e2+=2;
        }
        System.out.printf("min: %d\nmax: %d\n", min, max);
    }

    public static boolean checkIfOptimalPermutationExists(Integer[] arr1, Integer[] arr2, int k) {
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]+arr2[i] < k) return false;
        }

        return true;
    }
}

