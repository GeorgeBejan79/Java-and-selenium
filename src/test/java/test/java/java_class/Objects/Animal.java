package test.java.java_class.Objects;

public class Animal {
    String name;
    String color;
    int age;
    int energy;

    //public is acces modifier and it defines we can access this method everywhere in this project.
    public void sleep() {
        System.out.println(name + " is sleeping");
        energy = 100;

    }

    // create a method name speak , when the animal talks
    //will tell me the name, age,color, and energy
    public void speak() {
        System.out.println(name + " is sleeping");

        System.out.println("My name is " + name + ", my age is " + age + ", my color is " + color + ", energy is " + energy);


    } //will create a run method where it will show the animal is running

    public void run() {


        System.out.println(name + "is running");
        energy -= 10;
        System.out.println(name+" energy is "+energy);
    }

}