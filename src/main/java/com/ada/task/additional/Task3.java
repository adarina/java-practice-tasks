package com.ada.task.additional;

import com.ada.task.Task;

import java.util.ArrayList;
import java.util.List;

public class Task3 implements Task {

    private List<List<Integer>> pyramid(int number) {
        List<List<Integer>> array = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                row.add(1);
            }
            array.add(row);
        }
        return array;
    }

    @Override
    public void execute() {

        System.out.println(pyramid(0));
        System.out.println(pyramid(1));
        System.out.println(pyramid(2));
        System.out.println(pyramid(3));

    }
}
