package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {

      int two = first > second ? first : second;
       int three = two > third ? two : third;

               return three;
    }
}
