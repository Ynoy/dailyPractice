package com.cheneyin.designmode.strategy.behaviorInterface;

public class NoFlyBahavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not Fly...");
    }
}
