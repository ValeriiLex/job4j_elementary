package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare eared = new Hare();
        Wolf tooth = new Wolf();
        Fox red = new Fox();
        Ball round = new Ball();
        Run run = new Run();

        eared.tryEat(round);
        tooth.tryEat(round);
        red.tryEat(round);
        round.tryToRun(run);
    }

}
