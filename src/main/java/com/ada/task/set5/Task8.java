package com.ada.task.set5;

import com.ada.task.Task;

public class Task8 implements Task {


    @Override
    public void execute() {

        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        int count = 0;
        for (int num : numbers) {
            if (num >= 100 && num <= 999) {
                count++;
            }
        }
        System.out.println(count);

        count = 0;
        for (int[] row : numbers2D) {
            for (int num : row) {
                if (num >= 100 && num <= 999) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
