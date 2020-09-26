package ru.job4j.condition;

public class Artifact {

    int number;
String cultury;
int century;

public Artifact(int number, String cultury) {

    this.number = number;
    this.cultury = cultury;

}

public Artifact(int number, String cultury, int century) {

    this.number = number;
        this.cultury = cultury;
        this.century = century;

    }

    public static void main(String[] args) {
    Artifact artifact1 = new Artifact(1, "Egypt");
    Artifact artifact2 = new Artifact(4, "Aztec", 18);
    System.out.println(artifact1.number + artifact1.cultury);
        System.out.println(artifact2.number + " " + artifact2.cultury + " " + artifact2.century);
    }
}
