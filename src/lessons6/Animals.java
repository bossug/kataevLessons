package com.company;

abstract class Animals {
    private final int runMaxLimit = 0;
    private final int sweemMaxLimit = 0;
    private final double jumpMaxLimit = 0;

    abstract void run(int length);

    abstract void sweem(int length);

    abstract void jump(double height);
}
