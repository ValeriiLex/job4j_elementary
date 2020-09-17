package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert1367RblThenEuro() {
        int in = 1367;
        double expected = 19;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert256RblThenDollar() {
        int in = 256;
        double expected = 4;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}