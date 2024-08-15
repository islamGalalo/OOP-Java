package Composition;

public class Car {
    private  String model ;
    private  String color ;
    private  int year ;
    //car Has a Engine
    private  Engine myEngine ;



    public Car(String model, String color, int year , Engine myEngine   ) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.myEngine = myEngine;

    }

    public Car() {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getMyEngine() {
        return myEngine;
    }

    public void setMyEngine(Engine myEngine) {
        this.myEngine = myEngine;
    }
}
