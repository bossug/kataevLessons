package com.company;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vasilij", 50),
                new Cat("Persik", 50),
                new Cat("Barsik", 25),
                new Cat("Muha", 35),
                new Cat("Mura", 10)
        };
        Plate plate = new Plate( 40);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
