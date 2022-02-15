package com.company;

import java.util.PrimitiveIterator;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    void gas() {
        System.out.println("Газуем!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

    class Sedan extends Car{
        void brake(){
            System.out.println("Седан тормозит!");
        }
    }

