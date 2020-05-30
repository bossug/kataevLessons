package com.company;

public class Dog extends Animals {
    private final int runMaxLimit = 500;
    private final int sweemMaxLimit = 10;
    private final double jumpMaxLimit = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runMaxLimit)) System.out.println("run: true");
    }

    @Override
    protected void sweem(int length) {
        if ((length >= 0) && (length <= sweemMaxLimit)) System.out.println("swim: true");
        else System.out.println("sweem: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jumpMaxLimit)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
