package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 7;
        double exp = 0.984375;
        double res = SqArea.square(p, k);
        Assert.assertEquals(res, exp, 0.01);
    }

    @Test
    public void square1() {
        int p = 5;
        int k = 9;
        double exp = 0.5625;
        double res = SqArea.square(p, k);
        Assert.assertEquals(res, exp, 0.01);
    }
}