package main.java.Enums;

import java.lang.StringBuilder;

public class Easy {
    public enum TrafficSignal {
        RED,
        GREEN,
        YELLOW;

        public String getInstruction() {
            switch (this) {
                case RED:
                    return "STOP";

                case YELLOW:
                    return "SLOW DOWN";

                case GREEN:
                    return "GO";

                default:
                    throw new AssertionError();
            }
        }
    }

    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;

        public static int[] move(int[] start, Direction[] directions) {
            for (Direction direction : directions) {
                switch (direction) {
                    case UP -> start[1]++;
                    case DOWN -> start[1]--;
                    case LEFT -> start[0]--;
                    case RIGHT -> start[0]++;
                }
            } return start;
        }
    }
    
    public enum Chess {
        WHITE,
        BLACK;

        public Chess opposite() {
            return switch (this) {
                case WHITE -> BLACK;
                case BLACK -> WHITE;
            };
        }

        public static String opposite(String color) {
            Chess piece = Chess.valueOf(color);
            return piece.opposite().name();
        }
    }

    public enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;

        public static Season[] getSeasons() {
            return Season.values();
        } 

        public static int countSeasons() {
            return Season.values().length;
        }
    } 
    
    public enum GameMenu {
        NEW_GAME,
        LOAD_GAME,
        SETTINGS,
        EXIT;

        public static String renderMenu() {
            StringBuilder sb = new StringBuilder();
            for (GameMenu gm : GameMenu.values()) {
                String optionName = gm.name().replaceAll("_+", " ");
                sb.append((gm.ordinal()+1) + ". " + optionName + "\n");
            }
                
            return sb.toString();
        }
    }

    public enum GameCommand {
        MOVE,
        ATTACK,
        DEFEND,
        QUIT;

        public static GameCommand parse(String raw) {
            try {
                return GameCommand.valueOf(raw);
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public enum Task {
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL;

        private static void swap(Task[] tasks, int x, int y) {
            Task temp = tasks[x];
            tasks[x] = tasks[y];
            tasks[y] = temp;
        }

        public static void sortByPrioritySelectionSort(Task[] tasks) {
            if (tasks.length == 0)
                return;

            Task maxValue;
            int maxIdx;
            for (int i = 1; i < tasks.length; i++) {
                maxIdx = i-1; maxValue = tasks[i-1];
                for (int j = i; j < tasks.length; j++) {
                    if (maxValue.compareTo(tasks[j]) < 0) {
                        maxValue = tasks[j];
                        maxIdx = j;
                    }
                } if (maxIdx != i-1) swap(tasks, maxIdx, i-1);
            }
        }

        public static void sortByPriorityBubbleSort(Task[] tasks) {
            if (tasks.length <= 1)
                return;
            for (int i = tasks.length; i > 1; i--) {
                boolean swapped = false;
                for (int j = 1; j < i; j++) {
                    if (tasks[j].compareTo(tasks[j-1]) > 0) {
                        swap(tasks, j, j-1);
                        swapped = true;
                    }
                }

                if (!swapped)
                    return;
            }
        }

        public static void sortByPriorityInsertionSort(Task[] tasks) {
            if (tasks.length <= 1)
                return;

            for (int i = 1; i < tasks.length; i++) {
                Task temp = tasks[i];

                int j = i-1;
                for (; j >= 0 && tasks[j].compareTo(temp) < 0; j--) {
                    tasks[j+1] = tasks[j];
                }

                tasks[j+1] = temp;
            }
        }

        @Override
        public String toString() {
            return this.name();
        }
    }
}
