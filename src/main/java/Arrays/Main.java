package main.java.Arrays;

class Solutions {
    private static void printArr(boolean defaultMsg, int[] arr) {
        if (defaultMsg) {
            System.out.print("The given array is: ");
        }

        for (int i : arr) {
            System.out.print(i + " ");
        } System.out.println();
    }

    public static void easy() {
        // Find largest element in an array
        { 
            System.out.println("Find largest element in an array:");
            int[] arr = {5, 3, -1, 0, 10, 4};
            printArr(true, arr);
            System.out.printf("The largest element in the given array is: %d\n", Easy.findLargestElement(arr));
        } System.out.println();

        // Find second largest element in an array
        {
            System.out.println("Find second largest element in an array:");
            int[] arr = {5, 3, -1, 0, 10, 4};
            printArr(true, arr);
            System.out.printf("The second largest element in the given array is: %d\n", Easy.findSecondLargestElement(arr));
        } System.out.println();

        // Check if an array is sorted and rotated (leetcode: 1752)
        {
            System.out.println("Check if an array is sorted and rotated:");
            int[] arr = {1, 2, 0, -1, 0};
            printArr(true, arr);
            String msg = (Easy.checkIfSortedII(arr)) ? "The given array is sorted and rotated" : "The given array is not sorted and rotated";
            System.out.println(msg);
        } System.out.println();

        // Check if all A's appear before all B's (leetcode: 2124)
        {
            String s = "bbbb";
            System.out.println("The given string is: " + s);
            String msg =  (Easy.checkIfAsBeforeBs(s)) ? "All As are before the Bs" : "This string does not satify the condition";
            System.out.println(msg);
        } System.out.println();

        // Check if numbers are ascending in a sentence (leetcode: 2042)
        {
            String s = "There are 5 bananas in each of the 10 trees.";
            System.out.println("The given string is: " + s);
            String msg = (Easy.checkIfAscendingNumbersInString(s)) ? "The numbers in the string are in ascending order" : "The numbers are not in the ascending";
            System.out.println(msg);
        } System.out.println();

        // Remove Duplicates form Sorted Array (leetcode: 26)
        {
            int[] arr = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4};
            printArr(true, arr);
            System.out.printf("The number of unique elements in the array is: %d\n", Easy.removeDuplicatedFromSortedArray(arr));
        } System.out.println();

        // Rotate Array (leetcode: 189)
        {
            int[] arr = {1, 2, 3, 4, 5};
            printArr(true, arr);
            Easy.rotateArrayByKPlaces(arr, -6);
            System.out.print("The given array after rotation: ");
            printArr(false, arr);
        } System.out.println();

        // Move zeors to the end (leetcode: 283)
        {
            System.out.println("Move all zeroes to the end of an array:");
            int[] arr = {1, 0, 99, -2, 3, 0};
            printArr(true, arr);
            Easy.moveAllZerosToEnd(arr);
            System.out.print("The given array after moving all the zeroes to the end: ");
            printArr(false, arr);
        } System.out.println();

        // Linear Search an element in an array
        {
            System.out.println("Linear search an element in an array:");
            int[] arr = {1, 3, 0, -4, 3};
            printArr(true, arr);
            int idx = Easy.linearSearch(arr, 3);
            String msg = (idx != -1) ? "The index of the element in the array is: " : "There is no such element in the array";
            System.out.print(msg);
            if (idx != -1) System.out.println(idx);
            else System.out.println(); 
        } System.out.println();

        // Union of two sorted arrays
        {
            System.out.println("Union of two sorted arrays:");
            int[] arr1 = {1, 2, 3, 4, 5, 6, 6, 7, 9, 10};
            int[] arr2 = {1, 1, 2, 4, 5, 5, 6, 7, 8, 9, 9};
            printArr(true, arr1);
            printArr(true, arr2);
            int[] sol = Easy.unionOfSortedArrays(arr1, arr2);
            System.out.print("Array obtained after the union of the two sorted arrays is: ");
            printArr(false, sol);
        } System.out.println();

        // Find the missing number in an array
        {
            System.out.println("Finding a missing number in an array: ");
            int[] arr = {1, 3, 4, 5, 6, 7};
            printArr(true, arr);
            System.out.printf("The missing element in the array is: %d\n", Easy.findMissingNumber(arr));
        } System.out.println();

        // Maximum consecutive 1s (leetcode: 485)
        {

        }

        // Single Number (leetcode: 136)
        {

        }

        // Longest subarry with given sum k
        {
            System.out.println("Longest subarray with given sum: ");
            int[] arr = {10, 5, 2, 7, 1, 9};
            int k = 15;
            printArr(true, arr);
            System.out.printf("The longest subarray length with sum %d is: %d\n", k, Easy.longestSubarrayLengthSumK(arr, k));
        } System.out.println();
    }

    public static void medium() {
        // Two Sum (leetcode: 1)
        {

        }

        // Sort colors (leetcode: 75)
        {

        }

        // Find Majority Element I (leetcode: 169)
        {
            
        }

        // Maximum Subarray (leetcode: 53)
        {

        }

        // Best Time to Buy and Sell Stock (leetcode: 121)
        {

        }

        // Rearrange array elements by sign (leetcode: 2149)
        {

        }

        // Next Permutation (leetcode: 31)
        {
            
        }

        // Leaders in an array
        {
            System.out.println("Finding leaders in an array: ");
            int[] arr = {10, 22, 12, 4, 3, 7, 1, 0};
            printArr(true, arr);
            System.out.print("The leader in the given array are: ");
            Medium.leadersInArray(arr);
        } System.out.println();

        // Longest Consecutive Sequence (leetcode: 128)
        {
            
        }

        // Set Matrix Zeroes (leetcode: 73)
        {

        }

        // Rotate Image (leetcode: 48)
        {

        }

        // Print Matrix in spiral manner (leetcode: 54)
        {

        }

        // Count subarrays with given sum (leetcode: 560)
        {

        }
    }

    public static void hard() {
        // Pascal's Triangle I (leetcode: 118)
        {

        }

        // Majority Element II (leetcode: 229)
        {

        }

        // 3 Sum (leetcode: 15) 
        {
            
        }

        // 4 Sum (leetcode: 18)
        {

        }

        // Length of the longest subarray with zero sum
        {
            System.out.println("Find the length of the longest subarray with zero sum:");
            int[] arr = {8, 9, -3, 3, -9, 6, -5, 1, -2};
            printArr(true, arr);
            System.out.printf("The length of the longest subarray is: %d\n", Hard.findLongestSubarrayLengthSum0(arr));
        } System.out.println();

        // Count the number of subarrays with given xor k
        {
            System.out.println("Count the number of subarrays with given xor k:");
            int[] arr = {4, 2, 2, 6, 4};
            int k = 6;
            printArr(true, arr);
            System.out.printf("The number of subarrays with given xor k: %d\n", Hard.countSubarraysWithXorK(arr, k));
        } System.out.println();

        // Merge Intervals (leetocde: 56)
        {

        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        System.out.println("##### Easy Solutions #####");
        Solutions.easy();
        
        System.out.println("##### Medium Solutions #####");
        Solutions.medium();

        System.out.println("##### Hard Solutons #####");
        Solutions.hard();
    }
}
