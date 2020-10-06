package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int net = data.length;
        for (int i = 0; i < net; i++) {

            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
