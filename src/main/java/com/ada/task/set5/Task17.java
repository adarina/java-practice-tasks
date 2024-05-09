package com.ada.task.set5;

import com.ada.task.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task17 implements Task {
    @Override
    public void execute() {
        Map<String, String> albumMap = new HashMap<>();
        albumMap.put("The Sensual World", "Kate Bush");
        albumMap.put("Shaday", "Ofra Haza");
        albumMap.put("Achtung Baby", "U2");
        albumMap.put("Aion", "Dead Can Dance");
        albumMap.put("Invisible Touch", "Genesis");

        for (String album : albumMap.keySet()) {
            System.out.println(album);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an album name to check the artist:");
        String input = scanner.nextLine();

        if (albumMap.containsKey(input)) {
            String artist = albumMap.get(input);
            System.out.println("The artist of the album \"" + input + "\" is \"" + artist + "\".");
        } else {
            System.out.println("No data.");
        }
    }
}
