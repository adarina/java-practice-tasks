package com.ada.task.set4;

import com.ada.task.Task;

import java.util.Random;
import java.util.Scanner;

public class Task14 implements Task {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Random random = new Random();
        int positiveCount = 0;
        int negativeCount = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(201) - 100;
            if (randomNumber != 0) {
                if (randomNumber > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
                min = Math.min(min, randomNumber);
                max = Math.max(max, randomNumber);
            }
        }
        if (negativeCount == 0) {

            System.out.println("Positive: " + positiveCount);
        } else {
            System.out.println("Positive/negative: " + positiveCount / negativeCount);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
