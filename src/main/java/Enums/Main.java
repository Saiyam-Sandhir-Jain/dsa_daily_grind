package main.java.Enums;

import java.util.Arrays;

class Solutions {

    public static void easy() {

        // Q1. Traffic Signal
        {
            System.out.println("Q1. Traffic Signal:");

            Easy.TrafficSignal signal = Easy.TrafficSignal.GREEN;

            System.out.printf("Current Signal: %s\n", signal);
            System.out.printf("Instruction: %s\n", signal.getInstruction());
        }
        System.out.println();

        // Q2. Days of Week
        {
            System.out.println("Q2. Days of the Week:");

            Easy.Day day = Easy.Day.SATURDAY;

            System.out.printf("Current Day: %s\n", day);
            System.out.printf("Is Weekend: %b\n", day.isWeekend());
        }
        System.out.println();

        // Q3. Compass Direction
        {
            System.out.println("Q3. Robot Movement:");

            int[] start = {0, 0};

            Easy.Direction[] directions = {
                Easy.Direction.UP,
                Easy.Direction.UP,
                Easy.Direction.RIGHT,
                Easy.Direction.DOWN,
                Easy.Direction.LEFT
            };

            System.out.println("Start Position: " + Arrays.toString(start));
            System.out.println("Directions: " + Arrays.toString(directions));

            int[] end = Easy.Direction.move(start, directions);

            System.out.println("Final Position: " + Arrays.toString(end));
        }
        System.out.println();

        // Q4. Chess Piece Color
        {
            System.out.println("Q4. Chess Piece Color:");

            Easy.Chess piece = Easy.Chess.BLACK;

            System.out.printf("Chosen piece: %s\n", piece);
            System.out.printf("Opposite piece: %s\n", piece.opposite());
        }
        System.out.println();

        // Q5. List Seasons
        {
            System.out.println("Q5. List Seasons: ");

            System.out.print("The season are: ");
            for (Easy.Season season : Easy.Season.getSeasons()) {
                System.out.print(season + " ");
            } System.out.println();
        }
        System.out.println();

        // Q6. Count Seasons
        {
            System.out.println("Q6. Count Seasons: ");

            System.out.printf("The number of seasons are: %d\n", Easy.Season.countSeasons());
        }
        System.out.println();

        // Q7. Game Menu
        {
            System.out.println("Q7. Game Menu: ");

            System.out.printf("The rendered game menu:\n%s", Easy.GameMenu.renderMenu());
        }
        System.out.println();

        // Q8. Game Command
        {
            System.out.println("Q8. Game Command: ");

            String cmd = "ATTACK";
            System.out.println("The given command is: " + cmd);
            if (Easy.GameCommand.parse(cmd) == null)
                System.out.println("No such command exists");
            else
                System.out.println("Command exectued");
        }
        System.out.println();
    }

    public static void medium() {

    }

    public static void hard() {

    }
}

public class Main {

    record Section(String title, Runnable action) {}

    private static void runSection(Section section) {
        System.out.println("##### Enums (" + section.title() + ") #####");
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