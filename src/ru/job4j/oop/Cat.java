package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.food + this.name);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick(" Chen");
        gav.show();

        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick(" Back");
        black.show();

    }
}
