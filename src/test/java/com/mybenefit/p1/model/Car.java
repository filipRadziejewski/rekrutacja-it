package com.mybenefit.p1.model;


import com.mybenefit.p1.Vehicle;

import java.util.Objects;

public class Car implements Vehicle {
    private String manufacturer;
    private String model;
    private int power;
    private int displacement;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(String manufacturer, String model, int power, int displacement) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    @Override public String drive() {
        return "drive";
    }

    @Override public String stop() {
        return "stop";
    }

    @Override public String fuel() {
        return "fuel";
    }

    // ================ GETTERS AND SETTERS

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return power == car.power &&
            displacement == car.displacement &&
            Objects.equals(manufacturer, car.manufacturer) &&
            Objects.equals(model, car.model);
    }

    @Override public int hashCode() {
        return Objects.hash(manufacturer, model, power, displacement);
    }
}
