package com.cheneyin.designmode.strategy.behaviorInterface;

public class GaGaQuackBahavior implements QuackBahavior {
    @Override
    public void quack() {
        System.out.println("Ga Ga~");
    }
}
