package ru.job4j.condition;

public class Max {
                    public static int max(int left, int right) {
                        boolean c = left > right;
                        int result = c ? left : right;
                    return  result;
                }

                /*public static void main(String[] args) {
                int a = Max.max(2, 3);
                       System.out.println(a);             }*/
    public static void main(String[] args) {
        int a = Max.max(9, 3);
        System.out.println(a);
    }
        }
