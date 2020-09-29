package ru.job4j.condition;

public class Game1 {
    public static int checkGame(double percent, int prize, int pay) {
        if ((prize * percent) > pay && (percent * prize) >= 0) {
            return (int) (percent * prize - pay);
        }  else {
            return 0;
        }
    }
}
