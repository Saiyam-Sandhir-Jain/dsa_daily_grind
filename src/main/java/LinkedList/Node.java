package main.java.LinkedList;

public class Node {
    public static class Singly {
        private int val;
        private Singly next;

        // Contructors
        public Singly(int val) {
            this.val = val;
            this.next = null;
        }

        public Singly(int val, Singly next) {
            this.val = val;
            this.next = next;
        }

        // Getters
        public int getVal() {
            return this.val;
        }

        public Singly getNext() {
            return this.next;
        }

        // Setters
        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(Singly next) {
            this.next = next;
        }
    }

    public static class Doubly {
        private int val;
        private Doubly prev;
        private Doubly next;

        // Contructors
        public Doubly(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }

        public Doubly(int val, Doubly prev, Doubly next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        // Getters
        public int getVal() {
            return this.val;
        }

        public Doubly getPrev() {
            return this.prev;
        }

        public Doubly getNext() {
            return this.next;
        }

        // Setters
        public void setVal(int val) {
            this.val = val;
        }

        public void setPrev(Doubly prev) {
            this.prev = prev;
        }

        public void setNext(Doubly next) {
            this.next = next;
        }
    }
}
