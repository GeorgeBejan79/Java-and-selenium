package test.java.java_class.OOP.Vehicles;
public class Car extends Vehicle {
    String model;
    double engineSize;

    public Car(String model, String brand, int year) {
        super(model, brand, year);
        this.model=model;
        this.engineSize=3.5;
        // it calls constructor from parent class
        //it should be the first line
        }
        @Override
        public void drive() {
            System.out.println("Car is moving");
        }

        public Integer accelerate() {
            System.out.println(model+" of the car");
            return 10;
        }
        public boolean stop(){
            System.out.println("car is stopping");
        return false;
        }
        public long transmission(){
            return 5;
        }
        public static void main(String [] args){

        Vehicle vehicle =new Vehicle("Corrola", "Toyota", 2018);
        vehicle.accelerate();
            System.out.println(vehicle.model);
        Car car =new Car("Accord", "Honda", 2012);
        car.accelerate();
            System.out.println(car.model);
    }
}
