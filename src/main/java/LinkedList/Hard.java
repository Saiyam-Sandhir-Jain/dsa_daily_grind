package main.java.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Hard {

    class DoublyLinkedList {

        private final Node.LFU head;
        private final Node.LFU tail;
        private int size;

        public DoublyLinkedList() {
            head = new Node.LFU(0, 0);
            tail = new Node.LFU(0, 0);

            head.setNext(tail);
            tail.setPrev(head);

            size = 0;
        }

        public void addFirst(Node.LFU node) {

            node.setNext((Node.Doubly) head.getNext());
            node.setPrev(head);

            ((Node.LFU) head.getNext()).setPrev(node);
            head.setNext(node);

            size++;
        }

        public void remove(Node.LFU node) {

            Node.LFU prev = (Node.LFU) node.getPrev();
            Node.LFU next = (Node.LFU) node.getNext();

            prev.setNext(next);
            next.setPrev(prev);

            node.setPrev(null);
            node.setNext(null);

            size--;
        }

        public Node.LFU removeLast() {

            if (size == 0)
                return null;

            Node.LFU node = (Node.LFU) tail.getPrev();
            remove(node);

            return node;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    class LFUCache {

        private final int capacity;
        private int minFrequency;

        private final Map<Integer, Node.LFU> keyToNode;
        private final Map<Integer, DoublyLinkedList> frequencyToList;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.minFrequency = 0;
            this.keyToNode = new HashMap<>();
            this.frequencyToList = new HashMap<>();
        }

        public int get(int key) {

            Node.LFU node = keyToNode.get(key);

            if (node == null)
                return -1;

            updateFrequency(node);

            return node.getVal();
        }

        public void put(int key, int value) {

            if (capacity == 0)
                return;

            Node.LFU node = keyToNode.get(key);

            if (node != null) {
                node.setVal(value);
                updateFrequency(node);
                return;
            }

            if (keyToNode.size() == capacity) {

                DoublyLinkedList list = frequencyToList.get(minFrequency);
                Node.LFU removed = list.removeLast();

                keyToNode.remove(removed.getKey());
            }

            Node.LFU newNode = new Node.LFU(key, value);

            keyToNode.put(key, newNode);

            DoublyLinkedList list =
                    frequencyToList.getOrDefault(1, new DoublyLinkedList());

            list.addFirst(newNode);
            frequencyToList.put(1, list);

            minFrequency = 1;
        }

        private void updateFrequency(Node.LFU node) {

            int oldFrequency = node.getFrequency();

            DoublyLinkedList oldList = frequencyToList.get(oldFrequency);

            oldList.remove(node);

            if (oldFrequency == minFrequency && oldList.isEmpty())
                minFrequency++;

            node.incrementFrequency();

            DoublyLinkedList newList =
                    frequencyToList.getOrDefault(
                            node.getFrequency(),
                            new DoublyLinkedList()
                    );

            newList.addFirst(node);

            frequencyToList.put(node.getFrequency(), newList);
        }
    }
}