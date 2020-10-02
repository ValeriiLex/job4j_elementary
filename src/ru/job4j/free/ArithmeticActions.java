package ru.job4j.free;

public class ArithmeticActions {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static String selectAction(int left, int right, int rsl) {
        int one = left;
        int two = right;
        int three = rsl;
         if (one + two == rsl) {
             return "added";
         } else if (one - two == rsl) {
             return "subtracted";
         } else if (one * two == rsl) {
             return "multiplied";
         } else if (one / two == rsl) {
             return "divided";
         } else {
             return "none";
         }

    }
}
