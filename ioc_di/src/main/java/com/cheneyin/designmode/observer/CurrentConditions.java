package com.cheneyin.designmode.observer;

public class CurrentConditions implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("humidity:" + humidity);
        System.out.println("pressure:" + pressure);
        System.out.println("temperature:" + temperature);
    }
}
