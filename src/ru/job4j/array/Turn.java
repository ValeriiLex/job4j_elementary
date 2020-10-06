package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int net = array.length;
            for (int i = 0; i < net / 2; i++) {

            int temp = array[i];
                array[i] = array[net - i - 1];
                array[net - i - 1] = temp;
        }
        return array;
    }
}
