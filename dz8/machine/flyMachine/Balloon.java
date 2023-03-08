package dz8.machine.flyMachine;

import dz8.machine.FlyMachine;

public class Balloon extends FlyMachine {
    @Override
    public boolean fly() {
        System.out.println("Fly");

        return false;
    }
}
