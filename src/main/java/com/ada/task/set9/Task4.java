package com.ada.task.set9;

import com.ada.task.Task;

public class Task4 implements Task {

    public interface Calculator {
        int subtract(int a, int b);
        int add(int a, int b);
        int multiply(int a, int b);
        double divide(int a, int b);
    }
    public static class CalculationSystem {
        private Calculator calculator;

        public CalculationSystem(Calculator calculator) {
            this.calculator = calculator;
        }

        public void performCalculations(int a, int b) {

            System.out.println("a + b = " + calculator.add(a, b));
            System.out.println("a - b = " + calculator.subtract(a, b));
            System.out.println("a * b = " + calculator.multiply(a, b));
            System.out.println("a / b = " + calculator.divide(a, b));
        }
    }

    @Override
    public void execute() {

        Calculator calculator = new Calculator() {
            @Override
            public int subtract(int a, int b) {
                return a - b;
            }

            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }

            @Override
            public double divide(int a, int b) {
                if (b != 0) {
                    return (double) a / b;
                } else {
                    throw new IllegalArgumentException("Illegal");
                }
            }
        };

        CalculationSystem calculationSystem = new CalculationSystem(calculator);
        calculationSystem.performCalculations(2, 3);

    }
}
