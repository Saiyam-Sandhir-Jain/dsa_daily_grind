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
}
