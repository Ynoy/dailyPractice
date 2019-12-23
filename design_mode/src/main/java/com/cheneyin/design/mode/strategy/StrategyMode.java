package com.cheneyin.design.mode.strategy;

import com.cheneyin.design.mode.strategy.behaviorInterface.NoFlyBahavior;

/**
 * 01.设计模式之策略模式
 */
public class StrategyMode {
    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.CommonFeatureSwim();
        greenHeadDuck.CommonFeatureQuack();
        greenHeadDuck.fly();

        greenHeadDuck.setFlyBehavior(new NoFlyBahavior());
        greenHeadDuck.fly();
    }
}
