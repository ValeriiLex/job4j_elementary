package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

   @SuppressWarnings("checkstyle:EmptyLineSeparator")
   @Test
    public void whenSor() {
        int[] input = new int[] {8, 4, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 8, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {7, 3, 6, 1, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 3, 6, 7};
        assertThat(result, is(expect));
    }
}