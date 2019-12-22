package com.cheneyin.designmode.observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    private int temperature;
    private int humidity;
    private int pressure;

    private Set<Observer> observers=new HashSet<>();

    public WeatherData(){

    }

    public void dataChange(){
        notifyMessage();
    }

    public void setData(int temperature,int humidity,int pressure){
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        dataChange();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyMessage() {
        for (Observer observer:observers){
            observer.update(getTemperature(),getHumidity(),getPressure());
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
