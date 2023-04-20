package ru.job4j.converter;


import java.util.Locale;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        String result = String.format("%.4f", dollar);
        System.out.println("140 rubles are " + result + " dollar.");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float inD = 140;
        float expectedD = (float) 2.3333;
        float outD = Converter.rubleToDollar(inD);
        float result1 = Float.parseFloat(String.format(Locale.ROOT, "%.4f", outD));

        boolean passedD = expectedD == result1;
        System.out.println("140 rubles are 2,3333. Test result : " + passedD);
    }
}