package com.company;

public class Main {

    public static void main(String[] args) {
        Runner();
    }
    static void Runner(){
        Cat cat = new Cat();
        cat.run(150);
        cat.sweem(10);
        cat.jump(0.5);

        Dog dog = new Dog();
        dog.run(150);
        dog.sweem(9);
        dog.jump(0.5);
    }
}
