package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;


public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minus1(double first, double second) {
        return minus(first,second)+
                separate(first,second);
    }
    public static double rsl(double first, double second) {
        return sum(first, second)
                + multiply(first, second) +
                minus(first,second) +
                separate(first,second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minus1(10, 20));
        System.out.println("Результат расчета равен: " + rsl(10, 20));
    }
}
