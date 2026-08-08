package main.java.Enums;

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
}
