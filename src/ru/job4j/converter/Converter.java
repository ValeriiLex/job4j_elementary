package ru.job4j.converter;

public class Converter {

        public static int rubleToEuro(int value) {
          return value / 70;
        }

    public static int rubleToDollar(int value) {
            return value / 60;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(70);
            int dollar = Converter.rubleToDollar(60);

            System.out.println("70 rubles are " + euro + " euro");
            System.out.println("60 rubles are " + dollar + " dollar");
            System.out.println ("если бы так было я бы был рад ) ");
        }
    }

