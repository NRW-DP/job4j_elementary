package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndQuotient(double first, double second) {
        return difference(first, second)
                + quotient(first, second);
    }

    public static double sumOfAllMethods(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + quotient(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(2, 4));
        System.out.println("Результат расчета равен: " + differenceAndQuotient(10, 5));
        System.out.println("Результат расчета равен: " + sumOfAllMethods(4, 2));
    }
}