package com.ada.task.inclass;

import com.ada.task.Task;

public class Task2 implements Task {
    @Override
    public void execute() {
        int[] array4 = {1, -2, 4, -7, 19};

        int sumOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;
        for (int i = 0; i <= array4.length - 1; i++) {
            if (array4[i] >= 0) {
                sumOfPositiveNumbers += array4[i];
            } else {
                sumOfNegativeNumbers += array4[i];
            }
        }
        System.out.println(sumOfPositiveNumbers - sumOfNegativeNumbers);
    }
}
