package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

     public static int sumByEven(int start, int finish) {
            int sum1 = 0;
            for (int s = start; s <= finish; s++) {
                if (s % 2 == 0) {
                    sum1 = sum1 + s;
                }
            }
            return sum1;
        }

        public static void main(String[] args) {
            System.out.println(sum(0, 10));
            System.out.println(sum(3, 8));
            System.out.println(sum(1, 1));

            System.out.println(sumByEven(0, 10));
            System.out.println(sumByEven(3, 8));
            System.out.println(sumByEven(1, 1));
        }
    }


