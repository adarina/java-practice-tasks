package com.ada.task.set4;

import com.ada.task.Task;

public class Task9 implements Task {
    @Override
    public void execute() {
        double sumOfNaturalNumbers = 0.0;
        for (int i = 1; i <= 10; i++) {
            sumOfNaturalNumbers = sumOfNaturalNumbers + i;

        }
        System.out.println("Sum: " + sumOfNaturalNumbers / 10.0);
    }
}
