package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double result = first + second;
        double result1 = Math.sqrt(result);
        return result1;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(10, 20, 20, 30);
        System.out.println("result (10, 30) to (20, 40) " + result1);
    }
}

