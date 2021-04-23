package test.java.java_class.OOP.Polymorphism.Foods;
//child class
public abstract class Vegetable extends WholeFood implements Food {

    public int getPrice(){
        return 2;
    }
    public String color(){
        return "Green";
    }
}
