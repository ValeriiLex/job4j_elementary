package ru.job4j.converter;

public class Converter {

        public static int rubleToEuro(int value) {
          return value / 70;
        }

    public static int rubleToDollar(int value) {
            return -1;
        }

        public static void main(String[] args) {
            int in = 60;
            int expected = 1;
            int out = Converter.rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("60 rubles are 1. Test result : " + passed);

            int in1 = 70;
            int expected1 = 1;
            int out1 = Converter.rubleToEuro(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("70 rubles are 1. Test result : " + passed1);

            int euro = Converter.rubleToEuro(70);
            int dollar = Converter.rubleToDollar(60);

            System.out.println("70 rubles are " + euro + " euro");
            System.out.println("60 rubles are " + dollar + " dollar");

        }
    }

