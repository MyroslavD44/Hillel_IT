package dz8.machine.waterMachine;

import dz8.machine.WaterMachine;

public class Barge extends WaterMachine {
    @Override
    public boolean swim() {
        System.out.println("Swim");

        return false;
    }
}
