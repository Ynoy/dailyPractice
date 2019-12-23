package com.cheneyin.design.mode.strategy;

import com.cheneyin.design.mode.strategy.behaviorInterface.GaGaQuackBahavior;
import com.cheneyin.design.mode.strategy.behaviorInterface.GoodFlyBahavior;

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
