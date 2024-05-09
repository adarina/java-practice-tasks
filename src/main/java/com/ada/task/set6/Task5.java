package com.ada.task.set6;

import com.ada.task.Task;

public class Task5 implements Task {

    public static class Vehicle {
        private float maximumSpeed;
        private float mileage;

        public Vehicle(float maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
            this.mileage = 0.0f;
        }

        public float getMaximumSpeed() {
            return maximumSpeed;
        }

        public void setMaximumSpeed(float maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
        }

        public float getMileage() {
            return mileage;
        }

        public void setMileage(float mileage) {
            this.mileage = mileage;
        }

        public void increaseMileage(float value) {
            this.mileage += value;
        }
    }

    @Override
    public void execute() {

        Vehicle vehicle = new Vehicle(180.0f);
        System.out.println(vehicle.getMaximumSpeed());
        System.out.println(vehicle.getMileage());

        vehicle.increaseMileage(5.0f);
        System.out.println(vehicle.getMileage());

    }
}
