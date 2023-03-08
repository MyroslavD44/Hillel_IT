package dz8.animal.birds;

import dz8.animal.Birds;

public class Ostrich extends Birds {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
