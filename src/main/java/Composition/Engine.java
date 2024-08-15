package Composition;

public class Engine {
    private  String type ;
    private String horsePower;

    public Engine() {
    }
    public Engine(String type, String horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }
}
