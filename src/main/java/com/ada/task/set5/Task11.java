package com.ada.task.set5;

import com.ada.task.Task;

public class Task11 implements Task {
    @Override
    public void execute() {

        String[][] names2D = {{"John", "Jasper"},
                {"Casper", "Jonathan"},
                {"Unknown", "Unknown"},
                {"Alice", "Bob"},
                {"Stanley", "Unknown"}};

        for (String[] subArray : names2D) {
            boolean containsUnknown = false;
            for (String name : subArray) {
                if (name.contains("Unknown")) {
                    containsUnknown = true;
                    break;
                }
            }
            if (!containsUnknown) {
                for (String name : subArray) {
                    System.out.print(name + " ");
                }
                System.out.println();
            }
        }
    }
}
