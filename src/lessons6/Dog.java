package com.company;

public class Dog extends Animal {
    public double jump;
    public int sweem;
    private String nameValue = "метров";

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println(String.format(this.template, this.name, this.run, this.sweem, nameValue, this.jump));
        System.out.println();
    }
}
