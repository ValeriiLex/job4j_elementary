package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
           for (int i = 5; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        int a = Factorial.calc(1);
        System.out.println(a);
    }

}