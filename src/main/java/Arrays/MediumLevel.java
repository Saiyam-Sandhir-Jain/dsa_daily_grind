package main.java.Arrays;

import java.util.HashMap;

public class MediumLevel {
    public static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mem = new HashMap<>();
        mem.put(arr[0], 0);
        for (int i = 1; i < arr.length; ++i) {
            int reqValue = target - arr[i];
            if (mem.containsKey(reqValue)) return true;
            else mem.put(arr[i], i);
        } return false;
    }

    private static void swap(int arr[], int x, int y) {
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }

    public static void partitionArrayOf012(int[] arr) {
        int l = 0, r = arr.length-1, curr = 0;
        while(curr <= r) {
            if (arr[curr] == 0) {
                swap(arr, l++, curr++);
            } else if (arr[curr] == 2) {
                swap(arr, curr, r--);
            } else curr++;
        }   
    }

    public static int findMajorityOccuringElement(int[] arr) {
        int maxOccuringElement = arr[0], curr = 1, count = 1;
        for (; curr < arr.length; curr++) {
            if (arr[curr] == maxOccuringElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    maxOccuringElement = arr[curr];
                    count = 1;
                }
            }
        } 
        
        int occurance = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == maxOccuringElement) occurance++;
        } 
        if (occurance > arr.length/2) return maxOccuringElement;
        else return Integer.MIN_VALUE;
    }

    public static int kadanesAlgo(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) maxSum = currSum;
            if (currSum < 0) currSum = 0;
        }

        return maxSum;
    }

    public static void stockBuyAndSell(int[] arr) {
        int buy = 0, sell = 0, profit = 0;
        int bestBuy = buy, bestSell = sell, bestProfit = profit;
        for (int i = 1; i < arr.length; ++i) {
            if (buy == sell) {
                if (arr[i] < arr[buy]) {
                    buy = sell = i;
                    profit = 0;
                } else if (arr[i] > arr[buy]) {
                    sell = i;
                    profit = arr[sell] - arr[buy];
                    if (profit > bestProfit) {
                        bestBuy = buy;
                        bestSell = sell;
                        bestProfit = profit;
                    }
                }
            } else {
                if (arr[i] > arr[sell]) {
                    sell = i;
                    profit = arr[sell] - arr[buy];
                    if (profit > bestProfit) {
                        bestBuy = buy;
                        bestSell = sell;
                        bestProfit = profit;
                    }
                } else if (arr[i] < arr[buy]) {
                    buy = sell = i;
                    profit = 0;
                }
            }
        }

        if (bestProfit > 0) {
            System.out.printf("The investor should have bought on day %d and sold on day %d, gaining a profit of %d\n", bestBuy+1, bestSell+1, bestProfit);
        } else {
            System.out.println("The profit is 0");
        }  
    }
}
