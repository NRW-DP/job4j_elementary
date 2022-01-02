package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int lastElementLeft = left[left.length - 1];
        int lastElementRight = right[right.length - 1];
        return lastElementLeft == lastElementRight;
    }
}
