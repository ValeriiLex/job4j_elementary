package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;

        double p1 = p * (p - a) * (p - b) * (p -c);

        return Math.sqrt(p1);

    }

    public static void main(String[] args) {
        double a1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + a1);
    }
}
