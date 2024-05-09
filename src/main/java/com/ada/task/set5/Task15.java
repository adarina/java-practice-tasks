package com.ada.task.set5;

import com.ada.task.Task;

import java.util.ArrayList;
import java.util.Comparator;

public class Task15 implements Task {
    @Override
    public void execute() {
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Yellow");
        colorsList.add("Orange");
        colorsList.add("Purple");
        colorsList.add("Pink");
        colorsList.add("Brown");

        System.out.println("Color list:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        colorsList.set(4, "Lilac");

        colorsList.add(0, "Turquoise");

        colorsList.sort(Comparator.naturalOrder());

        ArrayList<String> reversedColors = new ArrayList<>(colorsList);
        reversedColors.sort(Comparator.reverseOrder());

        System.out.println("\nSorted:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        System.out.println("\nReversed:");
        for (String color : reversedColors) {
            System.out.println(color);
        }
    }
}
