package ru.job4j.loop;

public class Board1 {
    public static void paint(int width, int height) {
        for (int tls = 0; tls < height; tls++) {
            for (int doc = 0; doc < width; doc++) {
                /* условие проверки, что писать пробел или X */
                /* Выше в задании мы определили закономерность, когда нужно проста,влять X */
                if ((tls + doc) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }

            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(4, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(5, 4);
    }
}
