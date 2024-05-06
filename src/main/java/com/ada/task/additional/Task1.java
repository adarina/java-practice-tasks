package com.ada.task.additional;

import com.ada.task.Task;

import java.util.Arrays;

public class Task1 implements Task {

    public int[] partsSums(int[] ls) {
        int[] result = new int[ls.length + 1];

        for (int i = ls.length - 1; i >= 0; i--) {
            result[i] = ls[i] + result[i + 1];
        }
        return result;
    }

    @Override
    public void execute() {

        int[] ls1 = {1, 2, 3, 4, 5, 6};
        int[] ls2 = {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};
        System.out.println(Arrays.toString(partsSums(ls1)));
        System.out.println(Arrays.toString(partsSums(ls2)));

    }
}
