package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 1; i < word.length - 1; i++) {
            for (int k = 1; k < pref.length - 1; k++) {
                if (word[i].startsWith(pref[k])) {

                }
            }
            return result;
        }
    }
}