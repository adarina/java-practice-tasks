package com.ada.task.set5;

import com.ada.task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task13 implements Task {


    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();

        String word = scanner.nextLine();
        while (!word.equalsIgnoreCase("STOP")) {
            wordsList.add(word);
            System.out.println("Length: " + wordsList.size());
            System.out.println("First element: " + wordsList.get(0));
            System.out.println("Last element: " + wordsList.get(wordsList.size() - 1));
            int middleIndex = wordsList.size() / 2;
            System.out.println("Middle element: " + wordsList.get(middleIndex));
            System.out.println();
            word = scanner.nextLine();
        }
    }
}
