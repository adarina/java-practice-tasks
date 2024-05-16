package com.ada;

import com.ada.task.Task;
import com.ada.task.additional.Task1;
import com.ada.task.additional.Task2;
import com.ada.task.additional.Task3;
import com.ada.task.additional.Task4;
import com.ada.task.set6.Task5;
import com.ada.task.set6.Task9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task1());
        tasks.add(new Task2());
        tasks.add(new Task3());
        tasks.add(new Task4());

        tasks.add(new com.ada.task.set6.Task5());
        tasks.add(new com.ada.task.set6.Task9());

        tasks.add(new com.ada.task.set7.Task9());

        tasks.add(new com.ada.task.set8.Task8());

        tasks.add(new com.ada.task.set9.Task4());
        tasks.add(new com.ada.task.set9.Task9());

        for (Task task : tasks) {
            task.execute();
        }
    }
}