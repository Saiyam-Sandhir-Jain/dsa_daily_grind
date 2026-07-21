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

        }

        // Rotate Array (leetcode: 189)
        {
            
        }
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
