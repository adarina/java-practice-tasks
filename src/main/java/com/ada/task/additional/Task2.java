package com.ada.task.additional;

import com.ada.task.Task;

import static java.lang.Character.isLetter;

public class Task2 implements Task {

    private String abbreviate(String input) {

        StringBuilder result = new StringBuilder();
        int charCounter = 0;
        int wordLength = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (!isLetter(character)) {
                charCounter = i - 1;

                if (wordLength > 3) {
                    result.append(input.charAt(charCounter - wordLength + 1));
                    result.append(wordLength - 2);
                    result.append(input.charAt(charCounter));
                    result.append(character);
                } else if (wordLength > 0) {
                    result.append(input.charAt(charCounter - wordLength + 1));
                    int copy = charCounter - 1;
                    for (int j = 0; j < wordLength - 1; j++) {
                        result.append(input.charAt(copy));
                        copy++;
                    }
                    result.append(character);
                } else {
                    result.append(character);
                }
                wordLength = 0;
            } else {
                wordLength++;
            }
            charCounter++;
        }
        return String.valueOf(result);
    }

    @Override
    public void execute() {

        String str = "elephant-rides are really fun!";
        System.out.println(abbreviate(str));

    }
}
