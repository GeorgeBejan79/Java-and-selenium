package test.java.java_class.OOP.Abstaraction.Interface.Fly;

public class Plane implements Flyable{
    public void fly(){
        System.out.println("plane is flying high");
    }

    @Override
    public void makeNoise() {
        System.out.println("plane is flying loudly");}

    public int getPassengerNumber(){
        return 389;
    }
}
