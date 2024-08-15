package Composition;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Engine e1 = new Engine("BMW","455");
        c1.setMyEngine(e1);
       c1.getMyEngine().getHorsePower();

    }
}
