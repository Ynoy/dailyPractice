package com.cheneyin.designmode.strategy.behaviorInterface;

public class BadFlyBahavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Bad Fly ~");
    }
}
