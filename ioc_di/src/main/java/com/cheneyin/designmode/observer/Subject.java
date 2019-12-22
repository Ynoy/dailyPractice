package com.cheneyin.designmode.observer;

public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyMessage();

}
