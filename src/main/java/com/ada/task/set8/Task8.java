package com.ada.task.set8;

import com.ada.task.Task;

public class Task8 implements Task {

    static int warningCount = 0;
    static int infoCount = 0;

    public static void showWarning() {
        Warning.execute();
        warningCount++;
        System.out.println("Total warnings logged: " + warningCount);
    }

    public static void showInfo() {
        Info.execute();
        infoCount++;
        System.out.println("Total info logged: " + infoCount);
    }

    static class Warning {
        private static final String message = "Watch out! Warning here!";
        private static int count = 0;

        public static void execute() {
            System.out.println(message);
            count++;
            System.out.println("Warning logged " + count + " times.");
        }
    }

    static class Info {
        private static final String message = "Listen carefully. We have some information regarding ...";
        private static int count = 0;

        public static void execute() {
            System.out.println(message);
            count++;
            System.out.println("Info logged " + count + " times.");
        }
    }

    @Override
    public void execute() {

        showWarning();
        showInfo();
        showWarning();
        showInfo();
        showInfo();
    }
}
