package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {

        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0BCX2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenABCX1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenABX1C0() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenABC1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        Assert.assertEquals(expected, rsl);

    }

}
