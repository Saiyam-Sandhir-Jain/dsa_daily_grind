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
}
