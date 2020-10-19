package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "Неизвестное слово. " + eng;
        return eng;
    }

    public static void main(String[] args) {
        DummyDic pers = new DummyDic();
        String voice = pers.engToRus("Rock");
        System.out.println(voice);

    }
}
