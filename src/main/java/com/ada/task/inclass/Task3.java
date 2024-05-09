package com.ada.task.inclass;

import com.ada.task.Task;

import static java.lang.Character.isUpperCase;

public class Task3 implements Task {
    @Override
    public void execute() {
        String camelCasing = "CamelCasing";
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < camelCasing.length(); i++) {
            char letter = camelCasing.charAt(i);
            if (isUpperCase(letter)) {
                newString.append(" ");
            }
            newString.append(letter);
        }

        System.out.println(newString);
    }
}
