package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < word.length - 1; i++) {
            for (int k = 0; k < pref.length - 1; k++) {
                if (word[i] != pref[k]) {
                    continue;
                }
                result = true;
            }
        }
        return result;
    }
}