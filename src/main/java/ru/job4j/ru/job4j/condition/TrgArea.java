package ru.job4j.ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl1 = a + b + c;
        double rsl2 = rsl1 / 2;
        double rsl3 = rsl2 - a;
        double rsl4 = rsl2 - b;
        double rsl5 = rsl2 - c;
        double rsl6 = rsl3 * rsl4 *rsl5 * rsl2;
        double rsl = Math.sqrt(rsl6);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }


}
