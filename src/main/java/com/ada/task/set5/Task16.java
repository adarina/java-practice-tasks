package com.ada.task.set5;

import com.ada.task.Task;

import java.util.HashMap;
import java.util.Map;

public class Task16 implements Task {


    @Override
    public void execute() {
        Map<String, String> peselMap = new HashMap<>();

        peselMap.put("Ann", "92030412345");
        peselMap.put("Mary", "85063098765");
        peselMap.put("Tom", "91020387654");
        peselMap.put("Ned", "88052065432");
        peselMap.put("Ada", "93071278901");

        for (Map.Entry<String, String> entry : peselMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", PESEL: " + entry.getValue());
        }

        if (peselMap.containsKey("Ann")) {
            System.out.println("Name Ann is present");
        }

        for (String pesel : peselMap.values()) {
            if (pesel.startsWith("9")) {
                System.out.println("Value starting '9' is present.");
                break;
            }
        }

        peselMap.remove("Tom");
        peselMap.remove("Ned");

        if (peselMap.size() == 3) {
            System.out.println("Ok.");
        }

        if (peselMap.size() == 3) {
            System.out.println("Size is correct.");
        }

        String olafPesel = peselMap.get("Olaf");
        if (olafPesel == null) {
            System.out.println("Not present!");
        }

        if (peselMap.isEmpty()) {
            System.out.println("Nothing!");
        } else {
            System.out.println("Size: " + peselMap.size());
        }
    }
}
