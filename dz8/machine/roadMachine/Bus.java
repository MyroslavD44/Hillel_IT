package dz8.machine.roadMachine;

import dz8.machine.RoadMachine;

public class Bus extends RoadMachine {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
