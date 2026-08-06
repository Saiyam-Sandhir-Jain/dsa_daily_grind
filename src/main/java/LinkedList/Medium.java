package main.java.LinkedList;

public class Medium {
    public static Node.Singly deleteFromEnd(Node.Singly head, int n) {
        int count = n-1;
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
        if (head == null || head.getNext() == null) {
            return null;
        }

        Node.Singly slow = head, fast = head;
        Node.Singly meetNode = null;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                meetNode = slow;
                break;
            }
        } 

        if (meetNode == null) {
            return null;
        }

        while (head != meetNode) {
            head = head.getNext();
            meetNode = meetNode.getNext();
        }

        return head;
    }

    public static Node.Singly addTwoNumbers(Node.Singly l1, Node.Singly l2) {
        Node.Singly dummy = new Node.Singly(0);
        Node.Singly curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.getVal() : 0;
            int y = (l2 != null) ? l2.getVal() : 0;

            int sum = x + y + carry;

            carry = sum / 10;

            curr.setNext(new Node.Singly(sum % 10));
            curr = curr.getNext();

            if (l1 != null)
                l1 = l1.getNext();

            if (l2 != null)
                l2 = l2.getNext();
        }

        return dummy.getNext();
    }
}                
