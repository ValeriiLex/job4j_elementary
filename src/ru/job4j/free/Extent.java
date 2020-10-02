package ru.job4j.free;

public class Extent {
    public static void main(String[] args) {
        int number = 3;
        int result = number;
        int dig = 1;

             do {

            System.out.println(number + " в степени " + dig + " = " + result);
                 dig++;
                 result = (int) Math.pow(number, dig);
        } while (result < 10000);
    }
}
