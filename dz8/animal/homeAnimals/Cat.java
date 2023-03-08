package dz8.animal.homeAnimals;

import dz8.animal.HomeAnimals;

public class Cat extends HomeAnimals {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
