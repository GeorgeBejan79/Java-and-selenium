package test.java.java_class.OOP.Inheritance1;

import test.java.java_class.OOP.Inheritance.Cat;

public class Meshoo extends  Dog {
        String name;
    // if the parent class has no argument constructor child class must create constructor and implement super class constructor.

    public Meshoo(){
        super("Meshoo", 1, 3,10);
        //this("sss", 1, 3);
        this.name="Meshoo";
        System.out.println("Test");
    }
    public Meshoo(String name, int height, int weight){

        super(name, 1, height,weight);
        this.name=name;
    }
    public void play(){
        System.out.println(super.name+" is playing. ");
    }
    @Override
    public Cat barking(){
        System.out.println(this.name+"is barking");
        return new Cat();
    }
    public static void main(String[] args){

        Meshoo meshoo =new Meshoo();

        System.out.println(meshoo.name);
        //System.out.println(meshoo.weight); since weight is private, it is not inherited to the child class
        System.out.println(meshoo.getWeight());
        meshoo.play();
        meshoo.barking();
        Meshoo newMeshoo =new Meshoo("Meshoo 1", 2,12);
        System.out.println(newMeshoo.name);
        System.out.println(newMeshoo.age);
        System.out.println(newMeshoo.getWeight());
        meshoo.play();
        meshoo.barking();

    }
}
