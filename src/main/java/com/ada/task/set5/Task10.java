package com.ada.task.set5;

import com.ada.task.Task;

public class Task10 implements Task {

    @Override
    public void execute() {

        int[][] array = new int[10][3];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i + 1;
            array[i][1] = (i + 1) * (i + 1);
            array[i][2] = (i + 1) * (i + 1) * (i + 1);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d%-5d%-5d%n", array[i][0], array[i][1], array[i][2]);
        }
    }
}
