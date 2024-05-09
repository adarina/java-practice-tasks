package com.ada.task.set5;

import com.ada.task.Task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task20 implements Task {
    @Override
    public void execute() {
        List<String> colorList2 = List.of(
                "zielony", "czerwony", "niebieski", "czarny", "fioletowy",
                "granatowy", "niebieski", "czarny", "czarny", "zielony",
                "cytrynowy", "granatowy", "niebieski", "indygo", "zielony", "czerwony"
        );

        Set<String> colorSet = new HashSet<>(colorList2);

        int numberOfElements = colorList2.size();

        int numberOfDifferentColors = colorSet.size();

        for (String color : colorSet) {
            System.out.println(color);
        }

        colorSet.add("pomarańczowy");
        System.out.println("After adding pomarańczowy:");
        for (String color : colorSet) {
            System.out.println(color);
        }

        colorSet.remove("zielony");
        System.out.println("After deleting zielony:");
        for (String color : colorSet) {
            System.out.println(color);
        }

        System.out.println("Number of elements: " + numberOfElements);

        System.out.println("Number of different colors: " + numberOfDifferentColors);
    }
}
