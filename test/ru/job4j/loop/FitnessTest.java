package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(90, 90);

        assertThat(month, is(1));
        System.out.println(month);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
        System.out.println(month);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(10, 50);
        assertThat(month, is(4));
    }
}