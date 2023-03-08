package dz8.animal.fish;

import dz8.animal.Fish;

public class Carp extends Fish {
    @Override
    public boolean swim() {
        System.out.println("Swim");

        return false;
    }
}
