package org.example;

public class Trucks {

    String color;
    String model;
    int year;
    public Trucks(String color, String model, int year) {

        this.color = color;
        this.model = model;
        this.year = year;
    }
    public Trucks() {
        super();
    }
    public void TurnOn(){
        System.out.println("Truck On");
    }
    public void TurnOff(){
        System.out.println("Truck Off");
    }

}

