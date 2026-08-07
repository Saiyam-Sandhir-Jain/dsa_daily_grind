package main.java.LinkedList;

public class Node {

    public static abstract class Base {
        protected int val;

        public Base(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    public static class Singly extends Base {

        private Singly next;

        public Singly(int val) {
            super(val);
        }

        public Singly(int val, Singly next) {
            super(val);
            this.next = next;
        }

        public Singly getNext() {
            return next;
        }

        public void setNext(Singly next) {
            this.next = next;
        }
    }

    public static class Doubly extends Base {

        private Doubly prev;
        private Doubly next;

        public Doubly(int val) {
            super(val);
        }

        public Doubly(int val, Doubly prev, Doubly next) {
            super(val);
            this.prev = prev;
            this.next = next;
        }

        public Doubly getPrev() {
            return prev;
        }

        public Doubly getNext() {
            return next;
        }

        public void setPrev(Doubly prev) {
            this.prev = prev;
        }

        public void setNext(Doubly next) {
            this.next = next;
        }
    }

    public static class LRU extends Doubly {

        private int key;

        public LRU(int key, int value) {
            super(value);
            this.key = key;
        }

        public LRU(int key, int value, Doubly prev, Doubly next) {
            super(value, prev, next);
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
    }

    public static class LFU extends Doubly {

        private int key;
        private int frequency;

        public LFU(int key, int value) {
            super(value);
            this.key = key;
            this.frequency = 1;
        }

        public LFU(int key, int value, int frequency, Doubly prev, Doubly next) {
            super(value, prev, next);
            this.key = key;
            this.frequency = frequency;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public void incrementFrequency() {
            frequency++;
        }
    }
}