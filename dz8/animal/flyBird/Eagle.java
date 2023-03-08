package dz8.animal.flyBird;

import dz8.animal.FlyBirds;

public class Eagle extends FlyBirds {
    @Override
    public boolean fly() {
        System.out.println("Fly");

        return false;
    }
}
