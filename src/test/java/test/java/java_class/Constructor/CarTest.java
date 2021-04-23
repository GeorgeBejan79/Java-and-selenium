package test.java.java_class.Constructor;

public class CarTest {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=car1;
        car1=null;

        //How many object i have in this class?
        //If the object has no reference, java will call garbage colection.
        //how any objects is garbage collected?

    }
}
