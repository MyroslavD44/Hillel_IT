package dz8.animal.birds;

import dz8.animal.Birds;

public class Piching extends Birds {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
