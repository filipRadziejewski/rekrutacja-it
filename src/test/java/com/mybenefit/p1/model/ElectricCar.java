package com.mybenefit.p1.model;


public class ElectricCar extends Car{

    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public ElectricCar(String manufacturer, String model, int power) {
        super(manufacturer, model, power, 0);
    }

    @Override public String fuel() {

        throw new RuntimeException("You should not do that");
    }
}
