package com.ada.task.set4;

import com.ada.task.Task;

public class Task13 implements Task {
    @Override
    public void execute() {
        String password = "abcd";
        char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        for (char c1 : characters) {
            for (char c2 : characters) {
                for (char c3 : characters) {
                    for (char c4 : characters) {
                        String guess = String.valueOf(c1) + c2 + c3 + c4;
                        if (guess.equals(password)) {
                            System.out.println("Password: " + guess);
                            break;
                        }
                    }
                }
            }
        }
    }
}
