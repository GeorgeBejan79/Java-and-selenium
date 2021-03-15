package test.java.java_class.OOP.Abstaraction.Interface.Fly;
    public interface Flyable extends Noise{
        int WINGNUMBER=2;
        int TAILNUMBER=1;

    void fly();
    // we can create the body inside the interface only for default methods and static methods
        default void run(){
            System.out.println("it is running");
        }
}
