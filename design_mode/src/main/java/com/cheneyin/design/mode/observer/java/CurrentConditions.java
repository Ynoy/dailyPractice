package com.cheneyin.design.mode.observer.java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;


    public void display() {
        System.out.println("humidity:" + humidity);
        System.out.println("pressure:" + pressure);
        System.out.println("temperature:" + temperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temperature=((WeatherData.Data)arg).temperature;
        this.humidity=((WeatherData.Data)arg).humidity;
        this.pressure=((WeatherData.Data)arg).pressure;
    }
}
