package com.company;

import java.io.Console;

public class Test2 {
    private String nameCar;
    private int number;
    private int koleso;

    Test2(String nameCar, int number, int koleso){
        this.nameCar = nameCar;
        this.number = number;
        this.koleso = koleso;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getKoleso() {
        return koleso;
    }

    public void setKoleso(int koleso) {
        if(koleso >= 5){
            this.koleso = koleso;
        }else{
            System.out.println("У машины меньше четырех колес не бывает.");
        }
    }
}
