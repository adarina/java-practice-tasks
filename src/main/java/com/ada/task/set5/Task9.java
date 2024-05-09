package com.ada.task.set5;

import com.ada.task.Task;

public class Task9 implements Task {

    @Override
    public void execute() {

        int[][] arr = {
                {10, 20, 30, 40, 50, 60},
                {70, 80, 90, 100, 110, 120, 130},
                {140, 150, 160, 170, 180, 190, 200, 210},
                {220, 230, 240, 250, 260, 270, 280, 290, 300}
        };

        for (int[] subarr : arr) {
            for (int elem : subarr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}