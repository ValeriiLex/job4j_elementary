package ru.job4j.array;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

    public class MatrixSumTest {

        @Test
        public void whenSingle() {
            int[][] in = {
                    {10}
            };
            int expect = 10;
            int rsl = MatrixSum.sum(in);
            assertThat(rsl, is(expect));
        }

        @Test
        public void whenTwo() {
            int[][] in = {
                    {1, 3},
                    {1, 4}
            };
            int expect = 9;
            int rsl = MatrixSum.sum(in);
            assertThat(rsl, is(expect));
        }

        @Test
        public void whenThree() {
            int[][] in = {
                    {1, 3, 2, 1},
                    {1, 2, 1, 1}
            };
            int expect = 12;
            int rsl = MatrixSum.sum(in);
            assertThat(rsl, is(expect));
        }
    }

