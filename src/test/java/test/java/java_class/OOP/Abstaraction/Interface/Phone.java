package test.java.java_class.OOP.Abstaraction.Interface;

public abstract class Phone implements MemoryCard,TouchScreen {
    String name;
    int screenSize;

    public abstract void text();
    abstract void takePhoto();
    public static void play(){
        //Play is available inside MemoryCard. Since both of them are static methods
        //
        System.out.println("Phone is playing");
    }
}
