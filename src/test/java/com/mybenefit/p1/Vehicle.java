package com.mybenefit.p1;

public interface Vehicle {

    String drive();

    String stop();

    default String turnRight() {
        return "right";
    }

    default String turnLeft() {
        return "left";
    }

    String fuel();

    String getManufacturer();

    void setManufacturer(String manufacturer);

    String getModel();

    void setModel(String model);

    int getPower();

    void setPower(int power);

    int getDisplacement();

    void setDisplacement(int displacement);
}
