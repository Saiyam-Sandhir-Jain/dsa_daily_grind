package main.java.LeetCode;

import java.util.Map;
import java.util.HashMap;

class Problems {
    public static void twoSum(int[] arr, int target) {
        System.out.print("The required to indices are: ");
        Map<Integer, Integer> history = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; ++i) {
            int reqVal = target-arr[i];
            if (history.containsKey(reqVal)) {
                System.out.printf("(%d, %d)\n", i, history.get(reqVal));
            } history.put(arr[i], i);
        }
    }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), curr = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digitSum = carry;

            if (l1 != null) {
                digitSum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digitSum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(digitSum%10);
            curr = curr.next;
            carry = (digitSum < 10) ? 0 : 1;
        }

        System.out.print("Result: ");
        for (ListNode n = result.next; n != null; n = n.next) {
            System.out.printf("%d ", n.val);
        }
    }
}

public class Day1 {
    public static void main() {
        System.out.println("Day1 Solutions:-\n");

        // 1. Two Sum
        {
            System.out.println("1. Two Sum");
            int[] arr = {3, 2, 4};
            int target = 6;
            Problems.twoSum(arr, target);
        } System.out.println();

        // 2. Add Two Numbers
        {
            System.out.println("2. Add Two Numbers");

            // l1 = 2 -> 4 -> 3
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);

            // l2 = 5 -> 6 -> 4
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            Problems.addTwoNumbers(l1, l2);
        } System.out.println();

        System.out.println();
    }
}
