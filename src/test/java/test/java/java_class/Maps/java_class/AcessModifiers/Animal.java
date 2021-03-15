package test.java.java_class.AcessModifiers;

public class Animal {
    public String name;
    int age;
    protected String color;
    private String gender;

   // public Animal (){}

public void run(){
    System.out.println("animal is running");
}
    void eat(){
        System.out.println("Animal is eating");
    }
    private void sleep(){
        System.out.println("Animal is sleeping");
}
    protected static void walk(){
        System.out.println("Animal is walking");
    }
}
