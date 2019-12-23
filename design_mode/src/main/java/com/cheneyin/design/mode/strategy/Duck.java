package com.cheneyin.design.mode.strategy;

import com.cheneyin.design.mode.strategy.behaviorInterface.FlyBehavior;
import com.cheneyin.design.mode.strategy.behaviorInterface.QuackBahavior;

/**
 *  01.设计模式之策略模式:鸭子游戏
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBahavior quackBahavior;
    /*
        构造函数
     */
    public Duck(){

    }

    /*
        共同特点的具体实现
     */
    public void CommonFeatureSwim(){
        System.out.println("Swim...");
    }

    /*
        不同特点的颜色进行抽象
     */
    public abstract void NonCommonFeatureColor();

    /*
        共同特点的具体实现
     */
    public void CommonFeatureQuack(){
        System.out.println("Ga Ga Ga ~");
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBahavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBahavior(QuackBahavior quackBahavior) {
        this.quackBahavior = quackBahavior;
    }
}
