package com.cheneyin.design.mode.observer.java;

import com.cheneyin.design.mode.observer.Observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

public class WeatherData extends Observable {

    private int temperature;
    private int humidity;
    private int pressure;

    private Set<Observer> observers=new HashSet<>();

    public WeatherData(){

    }

    public void dataChange(){
        this.setChanged();
        this.notifyObservers(new Data(getTemperature(),getHumidity(),getPressure()));
    }

    public void setData(int temperature,int humidity,int pressure){
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        dataChange();
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
    public class Data{
        public int temperature;
        public int humidity;
        public int pressure;
        public Data(int temperature,int humidity,int pressure){
            this.humidity=humidity;
            this.pressure=pressure;
            this.temperature=temperature;
        }
    }
}
