package com.ada.task.additional;

import com.ada.task.Task;

public class Task4 implements Task {

    private String longestConsecutive(String[] strarr, int k) {
        int length = 0;
        String longestWord = "";

        int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return longestWord;
        } else {
            for (int i = 0; i < strarr.length - k + 1; i++) {
                StringBuilder word = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    word.append(strarr[i + j]);
                }
                int currentLength = word.length();
                if (currentLength > length) {
                    length = currentLength;
                    longestWord = word.toString();
                }
            }
        }
        return longestWord;
    }

    @Override
    public void execute() {

        String[] strarr1 = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k1 = 2;

        String[] strarr2 = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        int k2 = 2;

        System.out.println(longestConsecutive(strarr1, k1));
        System.out.println(longestConsecutive(strarr2, k2));

    }
}
