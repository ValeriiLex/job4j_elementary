package ru.job4j.array;

public class ArrayDefinition {
          public static void main(String[] args) {
        /*short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] pricts = new float[40];

        System.out.println("Размер массива равен:" + ages.length);
              System.out.println("Размер массива равен:" + surname.length);
              System.out.println("Размер массива равен:" + pricts.length);*/

              String[] names = new String[4];
              names[0] = "Ivan";
              names[1] = "Alex";
              names[2] = "Bob";
              names[3] = "John";
              int x = 0;
              String ref;

              while (x < 4) {
                  ref = names[x];
                   System.out.println(ref);
                   x = x + 1;
               }
    }
}