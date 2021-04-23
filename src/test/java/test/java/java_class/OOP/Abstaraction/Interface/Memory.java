package test.java.java_class.OOP.Abstaraction.Interface;

public interface Memory {

    public static final int CAPACITY = 64;

    //We can create the default method only inside interface
    //Default method by default has public acces modifier, we can't change it.
    public default void call() {
        System.out.println("Phone is ringing");
    }

    // speak() method is assumed to be public and abstract
    //in interface
    public abstract void speak();  // it is all ready public and abstract

    static void play() {
        System.out.println("phone is playing");
    }

    public static void record() {
        System.out.println("phone is playing ");
    }
}