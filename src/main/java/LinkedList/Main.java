package main.java.LinkedList;

import java.util.Arrays;

class Solutions {

    private static Node.Singly createList(int... values) {
        if (values.length == 0) return null;

        Node.Singly head = new Node.Singly(values[0]);
        Node.Singly curr = head;

        for (int i = 1; i < values.length; i++) {
            curr.setNext(new Node.Singly(values[i]));
            curr = curr.getNext();
        }

        return head;
    }

    private static void printList(Node.Singly head) {
        while (head != null) {
            System.out.print(head.getVal());
            if (head.getNext() != null) System.out.print(" -> ");
            head = head.getNext();
        }
        System.out.println();
    }

    public static void easy() {

        // Search Key
        {
            System.out.println("Search a key in a linked list:");

            Node.Singly head = createList(1, 2, 3, 4, 5);
            int key = 3;

            System.out.print("The given linked list: ");
            printList(head);

            System.out.printf("The key to search: %d\n", key);

            boolean found = Easy.searchKey(head, key);

            System.out.println(
                found
                    ? "The key exists in the linked list."
                    : "The key does not exist in the linked list."
            );
        }
        System.out.println();

        // Insert Node
        {
            System.out.println("Insert a node at a given index:");

            Node.Singly head = createList(1, 2, 3, 4, 5);
            int value = 100;
            int index = 2;

            System.out.print("The given linked list: ");
            printList(head);

            System.out.printf("Value: %d\n", value);
            System.out.printf("Index: %d\n", index);

            head = Easy.insert(head, value, index);

            System.out.print("The linked list after insertion: ");
            printList(head);
        }
        System.out.println();

        // Delete Node
        {
            System.out.println("Delete a node from a given index:");

            Node.Singly head = createList(1, 2, 3, 4, 5);
            int index = 2;

            System.out.print("The given linked list: ");
            printList(head);

            System.out.printf("Index: %d\n", index);

            head = Easy.delete(head, index);

            System.out.print("The linked list after deletion: ");
            printList(head);
        }
        System.out.println();

        // 160. Intersection of Two Linked Lists
        {
            System.out.println("Find the intersection node of two linked lists:");

            Node.Singly common = createList(8, 9, 10);

            Node.Singly headA = createList(1, 2, 3);
            Node.Singly temp = headA;
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(common);

            Node.Singly headB = createList(4, 5);
            temp = headB;
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(common);

            System.out.print("First linked list: ");
            printList(headA);

            System.out.print("Second linked list: ");
            printList(headB);

            Node.Singly intersection = Easy.getIntersectionNode(headA, headB);

            System.out.printf("The intersection node value is: %d\n", intersection.getVal());
        }
        System.out.println();

        // 876. Middle of the Linked List (First Middle)
        {
            System.out.println("Find the first middle node of a linked list:");

            Node.Singly head = createList(1, 2, 3, 4, 5, 6);

            System.out.print("The given linked list: ");
            printList(head);

            Node.Singly middle = Easy.firstMiddleNode(head);

            System.out.printf("The value of the first middle node is: %d\n", middle.getVal());
        }
        System.out.println();

        // 876. Middle of the Linked List (Second Middle)
        {
            System.out.println("Find the second middle node of a linked list:");

            Node.Singly head = createList(1, 2, 3, 4, 5, 6);

            System.out.print("The given linked list: ");
            printList(head);

            Node.Singly middle = Easy.secondMiddleNode(head);

            System.out.printf("The value of the second middle node is: %d\n", middle.getVal());
        }
        System.out.println();

        // 141. Linked List Cycle
        {
            System.out.println("Check whether a linked list contains a cycle:");

            Node.Singly head = createList(1, 2, 3, 4, 5);

            Node.Singly tail = head;
            Node.Singly cycleStart = null;

            while (tail.getNext() != null) {
                if (tail.getVal() == 3)
                    cycleStart = tail;

                tail = tail.getNext();
            }

            tail.setNext(cycleStart);

            System.out.println("The linked list created is: 1 -> 2 -> 3 -> 4 -> 5");
            System.out.printf("The tail node is connected to the node with value: %d\n", cycleStart.getVal());

            boolean hasCycle = Easy.hasCycle(head);

            System.out.println(
                hasCycle
                    ? "The linked list contains a cycle."
                    : "The linked list does not contain a cycle."
            );
        }
        System.out.println();
    }

    public static void medium() {

        // 19. Remove Nth Node From End of List
        {
            System.out.println("Remove the Nth node from the end of a linked list:");

            Node.Singly head = createList(1, 2, 3, 4, 5);
            int n = 2;

            System.out.print("The given linked list: ");
            printList(head);

            System.out.printf("The value of N is: %d\n", n);

            head = Medium.deleteFromEnd(head, n);

            System.out.print("The linked list after removing the Nth node from the end: ");
            printList(head);
        }
        System.out.println();

        // 328. Odd Even Linked List
        {
            System.out.println("Group all odd-indexed nodes followed by even-indexed nodes:");

            Node.Singly head = createList(1, 2, 3, 4, 5);

            System.out.print("The given linked list: ");
            printList(head);

            head = Medium.oddEvenList(head);

            System.out.print("The linked list after grouping odd and even indexed nodes: ");
            printList(head);
        }
        System.out.println();

        // 142. Linked List Cycle II
        {
            System.out.println("Find the starting node of the cycle in a linked list:");

            Node.Singly head = createList(1, 2, 3, 4, 5);

            Node.Singly tail = head;
            Node.Singly cycleStart = null;

            while (tail.getNext() != null) {
                if (tail.getVal() == 3)
                    cycleStart = tail;

                tail = tail.getNext();
            }

            tail.setNext(cycleStart);

            System.out.println("The linked list created is: 1 -> 2 -> 3 -> 4 -> 5");
            System.out.printf("The tail node is connected to the node with value: %d\n", cycleStart.getVal());

            Node.Singly start = Medium.detectCycle(head);

            System.out.printf("The cycle starts at the node with value: %d\n", start.getVal());
        }
        System.out.println();

        // 2. Add Two Numbers
        {
            System.out.println("Add two numbers represented by linked lists:");

            Node.Singly l1 = createList(2, 4, 3);
            Node.Singly l2 = createList(5, 6, 4);

            System.out.print("The first linked list: ");
            printList(l1);

            System.out.print("The second linked list: ");
            printList(l2);

            Node.Singly result = Medium.addTwoNumbers(l1, l2);

            System.out.print("The resulting linked list after addition: ");
            printList(result);
        }
        System.out.println();

        // 1019. Next Greater Node In Linked List
        {
            System.out.println("Find the next greater node for every node in a linked list:");

            Node.Singly head = createList(2, 1, 5);

            System.out.print("The given linked list: ");
            printList(head);

            int[] nextGreater = Medium.nextLargerNodes(head);

            System.out.println("The next greater node for each node is: " + Arrays.toString(nextGreater));
        }
        System.out.println();

        // 2487. Remove Nodes From Linked List
        {
            System.out.println("Remove every node that has a greater value node on its right:");

            Node.Singly head = createList(5, 2, 13, 3, 8);

            System.out.print("The given linked list: ");
            printList(head);

            head = Medium.removeNodes(head);

            System.out.print("The linked list after removing the required nodes: ");
            printList(head);
        }
        System.out.println();

        // 146. LRU Cache
        {
            System.out.println("Demonstrate the operations of an LRU Cache:");

            Medium medium = new Medium();
            Medium.LRUCache cache = medium.new LRUCache(2);

            System.out.println("Cache Capacity: 2");

            cache.put(1, 1);
            System.out.println("put(1, 1)");

            cache.put(2, 2);
            System.out.println("put(2, 2)");

            System.out.printf("get(1): %d\n", cache.get(1));

            cache.put(3, 3);
            System.out.println("put(3, 3)  // Evicts key 2");

            System.out.printf("get(2): %d\n", cache.get(2));

            cache.put(4, 4);
            System.out.println("put(4, 4)  // Evicts key 1");

            System.out.printf("get(1): %d\n", cache.get(1));
            System.out.printf("get(3): %d\n", cache.get(3));
            System.out.printf("get(4): %d\n", cache.get(4));
        }
        System.out.println();
    }

    public static void hard() {
        // 460. LFU Cache
        {
            System.out.println("Demonstrate the operations of an LFU Cache:");

            Hard hard = new Hard();
            Hard.LFUCache cache = hard.new LFUCache(2);

            System.out.println("Cache Capacity: 2");

            cache.put(1, 1);
            System.out.println("put(1, 1)");

            cache.put(2, 2);
            System.out.println("put(2, 2)");

            System.out.printf("get(1): %d\n", cache.get(1));

            cache.put(3, 3);
            System.out.println("put(3, 3)  // Evicts key 2");

            System.out.printf("get(2): %d\n", cache.get(2));

            System.out.printf("get(3): %d\n", cache.get(3));

            cache.put(4, 4);
            System.out.println("put(4, 4)  // Evicts key 1");

            System.out.printf("get(1): %d\n", cache.get(1));
            System.out.printf("get(3): %d\n", cache.get(3));
            System.out.printf("get(4): %d\n", cache.get(4));
        }
        System.out.println();
    }
}

public class Main {

    record Section(String title, Runnable action) {}

    private static void runSection(Section section) {
        System.out.println("##### Linked List (" + section.title() + ") #####");
        section.action().run();
        System.out.println();
    }

    public static void main(String[] args) {
        Section[] sections = {
            new Section("Easy", Solutions::easy),
            new Section("Medium", Solutions::medium),
            new Section("Hard", Solutions::hard)
        };

        for (Section section : sections) {
            runSection(section);
        }
    }
}