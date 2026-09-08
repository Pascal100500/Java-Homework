package ru.maxim.dz6;
import java.util.Random;

public class Boat {
    private int freeSeats;
    private boolean finalStop;

    private Random random = new Random();

    public Boat(boolean finalStop) {
        this.freeSeats = random.nextInt(10) + 1;
        this.finalStop = finalStop;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public boolean isFinalStop() {
        return finalStop;
    }
}
