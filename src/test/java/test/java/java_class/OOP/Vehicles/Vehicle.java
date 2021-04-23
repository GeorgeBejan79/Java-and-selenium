package test.java.java_class.OOP.Vehicles;
public class Vehicle {
    protected static String model;
    int year;
    public String brand;

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
    public void drive(){
        System.out.println("vehicle is moving");
    }
    public boolean stop(){
        System.out.println("vehicle is stopping");
        return true;
    }
    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }
    Object accelerate(){
        System.out.println("Model of the car");
        return new String();
    }
    public Vehicle(String model, String brand, int year){
        this.model=model;
        this.brand=brand;
        this.year=year;
    }
}
