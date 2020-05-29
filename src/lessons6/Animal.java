package com.company;

public class Animal {
    public String name;
    public int run;
    public String template = "Кличка: %s\n\rПробежал: %s метров\n\rПлавает: %s %s\n\rПрыжок на высоту: %s метров";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println(this.name);

    }
}
