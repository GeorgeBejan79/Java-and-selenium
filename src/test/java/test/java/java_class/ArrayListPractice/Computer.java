package test.java.java_class.ArrayListPractice;
public class Computer {
    String manufacturer;
    String name;
    Integer price;
    Double screenSize;

    public Computer(String manufacturer, String name, Integer price, Double screenSize){//constructor
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.name = name;
        this.price = price;
    }

    public Computer(String manufacturer, String name, Double screenSize){ //overloded constructor
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.name = name;
    }

    public String toString(){
        return this.manufacturer + " " + this.name + " " + this.price + " " + this.screenSize;
    }
}
