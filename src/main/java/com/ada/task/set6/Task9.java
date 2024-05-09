package com.ada.task.set6;

import com.ada.task.Task;

public class Task9 implements Task {

    public static class Multiplication {

        public Multiplication() {
        }

        private double execute(double a, double b) {
            return a * b;
        }

        private float execute(float a, float b) {
            return a * b;
        }

        private int execute(int a, int b) {
            return a * b;
        }
    }

    @Override
    public void execute() {

        Multiplication multiplication = new Multiplication();
        System.out.println("Int result: " + multiplication.execute(2, 3));
        System.out.println("Float result: " + multiplication.execute(-2.0f, 3.0f));
        System.out.println("Double result: " + multiplication.execute(2.0, 3.9));

    }
}