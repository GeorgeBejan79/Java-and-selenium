package test.java.java_class.OOP.Abstaraction.Interface.Fly;

public class Test {
    public static void main(String[] args) {
        Plane plane=new Plane();
        System.out.println(plane.getPassengerNumber());
        plane.run();
        Bird bird=new Bird();
        bird.run();
    }
}
