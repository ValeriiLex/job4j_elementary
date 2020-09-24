package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            n = n * i;

        }
        System.out.println(n);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 1;
        for (int i = 1; i < 0; i++) {
            n = n * i;
        }
        System.out.println(n);
    }
}