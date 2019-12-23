package com.cheneyin.design.mode.observer;

public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyMessage();

}
