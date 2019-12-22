package com.cheneyin.designmode.strategy.behaviorInterface;

public class GoodFlyBahavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Good Fly ~");
    }
}
