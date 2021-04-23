package test.java.java_class.OOP.Inheritance1;
import test.java.java_class.OOP.Inheritance.Animal;

public class Dog extends Object{
    String name;
    int age;
    public int height;
    private int weight;

    public Dog(String name, int age, int height, int weight){
        super(); //super() is the constructor which is coming from super /parent class
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;

    }
    public Animal barking(){
        return new Animal();
    }
    public boolean wakeUp(){
        return true;
    }

public int getWeight(){
    return weight;
}}