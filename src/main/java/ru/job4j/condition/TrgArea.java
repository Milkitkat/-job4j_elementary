package ru.job4j.condition;



    public class TrgArea {
        public static double area(double a, double b, double c) {
            double rsl1 = (a + b + c) / 2;
            double rsl2 = (rsl1 - a) * (rsl1 - b) * (rsl1 - c) * rsl1;
            return Math.sqrt(rsl2);
        }

        public static void main(String[] args) {
            double rsl = TrgArea.area(2, 2, 2);
            System.out.println("area (2, 2, 2) = " + rsl);
        }
    }