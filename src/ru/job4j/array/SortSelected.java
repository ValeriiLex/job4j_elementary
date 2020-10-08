package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int arr = data.length;
        for (int i = 0; i < arr; i++) {
            int min = MinDiapason.findMin(data, 0 + i, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0 + i, data.length - 1);

            min = data[index];
            data[index] = data[i];
            data[i] = min;

        }
        return data;
    }
}
