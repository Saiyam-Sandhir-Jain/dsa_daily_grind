package main.java.Strings;

class Solutions {
    public static void easy() {

    }

    public static void medium() {

    }

    public static void hard() {

    }
}

public class Main {
    record Section(String title, Runnable action) {}

    private static void runSection(Section section) {
        System.out.println("##### String (" + section.title() + ") #####");
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
