package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
           for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
         int i = 0;
        for (int arr : array) {
         System.out.println("bound " + i + "=" + arr);
          i++;
        }
    }
}
