package main.java.Recursion;

class Solutions {
    public static void linear() {

    }

    public static void nonLinear() {

    }

    public static void divideConquer() {

    }

    public static void linkedList() {

    }

    public static void stack() {

    }

    public static void subsequences() {

    }
}

public class Main {
    record Section(String title, Runnable func) {}

    private static void runSection(Section section) {
        System.out.println("##### Recursion (" + section.title() + ") #####");
        section.func().run();
        System.out.println();
    }

    public static void main(String[] args) {
        Section[] sections = {
            new Section("Linear", Solutions::linear),
            new Section("Non Linear", Solutions::nonLinear),
            new Section("Divide & Conquer", Solutions::divideConquer),
            new Section("Linked List", Solutions::linkedList),
            new Section("Stack", Solutions::stack),
            new Section("Subsequences", Solutions::subsequences)
        };

        for (Section section : sections) {
            runSection(section);
        }
    }
}
