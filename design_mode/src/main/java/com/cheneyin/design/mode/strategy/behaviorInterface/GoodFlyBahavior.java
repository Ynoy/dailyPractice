package com.cheneyin.design.mode.strategy.behaviorInterface;

public class GoodFlyBahavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Good Fly ~");
    }
}
