package test.java.java_class.OOP.Abstaraction.Interface.Fly;

public class Bird implements Flyable{

    @Override
public void fly(){
        System.out.println("Bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is chirping");
    }
    @Override
    public void run(){
        System.out.println("Bird is running");
    }
}