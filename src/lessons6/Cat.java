package com.company;

public class Cat extends Animals {
    private final int runMaxLimit = 200;
    private final double jumpMaxLimit = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runMaxLimit)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    protected void sweem(int length) {
        System.out.println("sweem: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jumpMaxLimit)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
