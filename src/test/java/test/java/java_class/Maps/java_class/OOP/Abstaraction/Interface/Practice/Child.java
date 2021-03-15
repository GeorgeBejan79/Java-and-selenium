package test.java.java_class.OOP.Abstaraction.Interface.Practice;

public class Child extends GrandParent implements Parent {

    public void run(){
        System.out.println("run");
    }
    public  static void talk(){
        System.out.println("chiald is talking");
    }
    public static void move(){
        System.out.println("Child is moving");
    }
    public void start(){
        talk();// static method  from regular class
        //will be inherited under child clas
        //static method from the interfacesare not inherited under subclasses
    }
}
