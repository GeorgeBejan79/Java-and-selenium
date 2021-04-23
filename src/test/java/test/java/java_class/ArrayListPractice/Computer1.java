package test.java.java_class.ArrayListPractice;

public class Computer1 {
    String manufacturer;
    String name;
    Integer price;
    Double screenSize;

    public Computer1(String manufacturer, String name, Integer price, Double screenSize){
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.name = name;
        this.price = price;
    }
    public Computer1(String manufacturer, String name, Double screenSize){
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.name = name;
    }

    public String toString(){
        return this.manufacturer + " " + this.name + " " + this.price + " " + this.screenSize;
    }
}
