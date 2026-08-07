package main.java.LinkedList;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.ArrayDeque;

public class Medium {

    public static Node.Singly deleteFromEnd(Node.Singly head, int n) {
        int count = n - 1;
        Node.Singly temp = head;

        while (count > 0 && temp != null) {
            temp = temp.getNext();
            count--;
        }

        if (temp == null)
            return head;

        Node.Singly curr = head, prev = null;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            prev = curr;
            curr = curr.getNext();
        }

        if (prev == null)
            head = curr.getNext();
        else
            prev.setNext(curr.getNext());

        return head;
    }

    public static Node.Singly oddEvenList(Node.Singly head) {
        if (head == null)
            return head;

        Node.Singly eCurr = head;
        Node.Singly oHead = head.getNext(), oCurr = oHead;

        while (oCurr != null && oCurr.getNext() != null) {
            eCurr.setNext(oCurr.getNext());
            eCurr = eCurr.getNext();

            oCurr.setNext(eCurr.getNext());
            oCurr = oCurr.getNext();
        }

        eCurr.setNext(oHead);

        return head;
    }

    public static Node.Singly detectCycle(Node.Singly head) {
        if (head == null || head.getNext() == null)
            return null;

        Node.Singly slow = head, fast = head, meet = null;

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                meet = slow;
                break;
            }
        }

        if (meet == null)
            return null;

        while (head != meet) {
            head = head.getNext();
            meet = meet.getNext();
        }

        return head;
    }

    public static Node.Singly addTwoNumbers(Node.Singly l1, Node.Singly l2) {
        Node.Singly dummy = new Node.Singly(0);
        Node.Singly curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.getVal() : 0;
            int y = l2 != null ? l2.getVal() : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.setNext(new Node.Singly(sum % 10));
            curr = curr.getNext();

            if (l1 != null) l1 = l1.getNext();
            if (l2 != null) l2 = l2.getNext();
        }

        return dummy.getNext();
    }

    public static int[] nextLargerNodes(Node.Singly head) {
        Deque<int[]> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        int idx = 0;

        while (head != null) {
            list.add(0);

            while (!stack.isEmpty() && stack.peek()[0] < head.getVal()) {
                list.set(stack.pop()[1], head.getVal());
            }

            stack.push(new int[]{head.getVal(), idx++});
            head = head.getNext();
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = list.get(i);

        return ans;
    }

    public static Node.Singly removeNodes(Node.Singly head) {
        Deque<Node.Singly> stack = new ArrayDeque<>();

        Node.Singly curr = head;

        while (curr != null) {
            while (!stack.isEmpty() && curr.getVal() > stack.peek().getVal()) {
                stack.pop().setVal(0);
            }
            stack.push(curr);
            curr = curr.getNext();
        }

        while (head != null && head.getVal() == 0)
            head = head.getNext();

        curr = head;

        while (curr != null) {
            while (curr.getNext() != null && curr.getNext().getVal() == 0)
                curr.setNext(curr.getNext().getNext());

            curr = curr.getNext();
        }

        return head;
    }

    class LRUCache {

        private final int capacity;
        private int size;

        private Node.LRU lru;
        private Node.LRU mru;

        private final Map<Integer, Node.LRU> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.lru = null;
            this.mru = null;
            this.map = new HashMap<>();
        }

        private void remove(Node.LRU node) {

            Node.LRU prev = (Node.LRU) node.getPrev();
            Node.LRU next = (Node.LRU) node.getNext();

            if (prev != null)
                prev.setNext(next);
            else
                lru = next;

            if (next != null)
                next.setPrev(prev);
            else
                mru = prev;

            node.setPrev(null);
            node.setNext(null);
        }

        private void insertAtMRU(Node.LRU node) {

            if (mru == null) {
                lru = node;
                mru = node;
                return;
            }

            node.setPrev(mru);
            node.setNext(null);

            mru.setNext(node);
            mru = node;
        }

        public int get(int key) {

            Node.LRU node = map.get(key);

            if (node == null)
                return -1;

            if (node != mru) {
                remove(node);
                insertAtMRU(node);
            }

            return node.getVal();
        }

        public void put(int key, int value) {

            Node.LRU node = map.get(key);

            if (node != null) {
                node.setVal(value);

                if (node != mru) {
                    remove(node);
                    insertAtMRU(node);
                }

                return;
            }

            if (size == capacity) {

                Node.LRU old = lru;

                remove(old);
                map.remove(old.getKey());

                size--;
            }

            Node.LRU newNode = new Node.LRU(key, value);

            insertAtMRU(newNode);
            map.put(key, newNode);

            size++;
        }
    }
}