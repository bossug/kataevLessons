package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Кошка");
        Cat cat = new Cat("Беляшик", 100, false, 1);
        animal.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Собака");
        Dog dog = new Dog("Тузик", 400, 7, 0.6);
        danimal.animalInfo();
        dog.dogInfo();
    }
}
