package main.java.LinkedList;

public class Easy {
    public static boolean searchKey(Node.Singly head, int key) {
        while (head != null) {
            if (head.getVal() == key) {
                return true;
            } head = head.getNext();
        }

        return false;
    }

    public static Node.Singly insert(Node.Singly head, int val, int idx) {
        if (idx < 0) {
            return head;
        }

        if (idx == 0) {
            return new Node.Singly(val, head);
        }

        Node.Singly curr = head;
        Node.Singly prev = null;
        while (curr != null && idx > 0) {
            prev = curr;
            curr = curr.getNext();
            idx--;
        }

        if (curr == null && idx != 0){
            return head;
        }

        prev.setNext(new Node.Singly(val, curr));

        return head;
    }

    public static Node.Singly delete(Node.Singly head, int idx) {
        if (idx < 0 || head == null)
            return head;

        if (idx == 0) {
            head = head.getNext();
            return head;
        }

        Node.Singly curr = head, prev = null;
        while (curr.getNext() != null && idx > 0) {
            prev = curr;
            curr = curr.getNext();
            idx--;
        }

        if (idx > 0)
            return head;

        prev.setNext(curr.getNext());
        return head;
    }

    public static Node.Singly getIntersectionNode(Node.Singly headA, Node.Singly headB) {
        Node.Singly currA = headA, currB = headB;

        while (currA != currB) {
            currA = currA.getNext();
            currB = currB.getNext();

            if (currA == null && currB != null)
                currA = headB;
            else if (currA != null && currB == null)
                currB = headA;
        }

        return currA;
    }

    public static Node.Singly firstMiddleNode(Node.Singly head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node.Singly slow = head, fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return slow;
    }

    public static Node.Singly secondMiddleNode(Node.Singly head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node.Singly slow = head, fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        if (fast.getNext() != null) {
            return slow.getNext();
        }

        return slow;
    }

    public static boolean hasCycle(Node.Singly head) {
        if (head == null || head.getNext() == null)
            return false;

        Node.Singly slow = head, fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();

            if (fast == slow)
                return true;
        }

        return false;
    }
}
