package com.company;

public class Cat extends Animal {
    protected boolean sweem;
    int jump;
    private String nameValue = "";


    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println(String.format(this.template, this.name, this.run, this.sweem, nameValue, this.jump));
        System.out.println();
    }
}
