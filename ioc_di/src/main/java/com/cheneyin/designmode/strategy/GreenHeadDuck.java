package com.cheneyin.designmode.strategy;

import com.cheneyin.designmode.strategy.behaviorInterface.GaGaQuackBahavior;
import com.cheneyin.designmode.strategy.behaviorInterface.GoodFlyBahavior;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBahavior();
        quackBahavior = new GaGaQuackBahavior();
    }

    @Override
    public void NonCommonFeatureColor() {
        System.out.println("I`m Green Head.");
    }
}
