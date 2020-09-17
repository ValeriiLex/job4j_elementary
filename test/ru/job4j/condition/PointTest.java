package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when0020() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int ex = 2;
        double res = Point.distance(x1, y1,  x2, y2);
        Assert.assertEquals(ex, res, 0.01);
    }

    @Test
    public void when1920() {
        int x1 = 1;
        int y1 = 9;
        int x2 = 2;
        int y2 = 0;
        double ex = 9.055385138137417;
        double res = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(ex, res, 0.01);
            }

            @Test
    public void when4117201() {
        int x1 = 41;
        int y1 = 17;
        int x2 = 2;
        int y2 = 1;
        double ex = 42.15447781671598;
        double res = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(ex, res, 0.01);

    }

}