package com.ada.task.set9;

import com.ada.task.Task;

import java.util.ArrayList;
import java.util.List;

public class Task9 implements Task {


    abstract static class Vehicle {
        abstract void move();
    }

    static class Motorcycle extends Vehicle {
        void move() {
            System.out.println("Motorcycle is moving");
        }
    }

    static class Car extends Vehicle {
        void move() {
            System.out.println("Car is moving");
        }
    }

    static class Tram extends Vehicle {
        void move() {
            System.out.println("Tram is moving");
        }
    }

    @Override
    public void execute() {
        List<Vehicle> vehicles = new ArrayList<>();

        Motorcycle motorcycle1 = new Motorcycle();
        Motorcycle motorcycle2 = new Motorcycle();
        Motorcycle motorcycle3 = new Motorcycle();

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Tram tram1 = new Tram();
        Tram tram2 = new Tram();
        Tram tram3 = new Tram();

        vehicles.add(motorcycle1);
        vehicles.add(motorcycle2);
        vehicles.add(motorcycle3);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);

        vehicles.add(tram1);
        vehicles.add(tram2);
        vehicles.add(tram3);


        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
