package org.example;

public class Cars {
     String name;
    boolean isUsed ;
        int year;
     String model;
     String color;

    public Cars(String model, int year, String color) {
        this.color = color;
        this.model = model;
        this.year = year;

    }

    public Cars(String name , boolean isUsed) {
     this.name = name;
     this.isUsed = isUsed;
    }

    public Cars() {

    }

}
