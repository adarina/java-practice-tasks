package com.ada.task.set4;

import com.ada.task.Task;

public class Task15 implements Task {
    @Override
    public void execute() {
        int number = 6;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("Number " + number + " is perfect.");
        } else {
            System.out.println("Number " + number + " is not perfect.");
        }
    }
}
