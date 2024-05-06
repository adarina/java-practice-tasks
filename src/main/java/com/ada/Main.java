package com.ada;

import com.ada.task.Task;
import com.ada.task.additional.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task1());

        for (Task task : tasks) {
            task.execute();
        }
    }
}