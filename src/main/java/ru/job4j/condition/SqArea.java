package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double rsl = k + 1;
        double rsl2 = rsl * 2;
        double rsl3 = p / rsl2;
        double rsl4 = rsl3 * k;
        double rsl5 = rsl4 * rsl3;
        return rsl5;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
