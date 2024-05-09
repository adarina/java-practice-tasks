package com.ada.task.inclass;

import com.ada.task.Task;

public class Task1 implements Task {

    public static boolean isAscOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void execute() {
        int[] array1 = {1, 2, 4, 7, 19};
        int[] array2 = {1, 6, 10, 18, 2, 4, 20};
        int[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(isAscOrder(array1));
        System.out.println(isAscOrder(array2));
        System.out.println(isAscOrder(array3));
    }
}
