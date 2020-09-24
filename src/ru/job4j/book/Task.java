package ru.job4j.book;

public class Task {
        public static void mai(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "фронтэнд", "динамичный", "умный", "шестой", "метод критического пути", "взаимный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "центральный", "gjpbwbjybhjdfyysq", "использованный с выгодой", "выровненный", "ориентированный"};
        String[] wordLineThree = {"процесс", "тип структуры", "период времени", "образец", "талант", "подход"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordLineThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[random2] + " " + wordLineThree[random3];
        System.out.print("Всё,что нам нужно, - это " + phrase);
    }
}
