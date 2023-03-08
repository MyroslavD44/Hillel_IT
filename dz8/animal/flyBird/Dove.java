package dz8.animal.flyBird;

import dz8.animal.FlyBirds;

public class Dove extends FlyBirds {
    @Override
    public boolean fly() {
        System.out.println("Fly");

        return false;
    }
}
