package com.cheneyin.design.mode.observer;

/**
 * 03.设计模式之观察者模式
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData();
        weatherData.register(currentConditions);
        weatherData.setData(10, 20, 30);
    }
}
