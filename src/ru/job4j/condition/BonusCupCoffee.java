package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int all = (count / n) + count;
        return (int) all;
    }
}