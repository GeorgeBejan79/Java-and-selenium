package test.java.java_class.OOP.Inheritance;

public class Cat extends DomesticAnimal {
    public void jump(){
        System.out.println("Cat is jumping");
    }
    @Override
    public void run(){
        System.out.println("Cat is running ");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        //run method comes from domestic  cat class
        //since is is overriding inside the cat class.
        cat.sleep();

        //sleep() is coming from Animal class
        //since is not available in domestic animal
        cat.speak();

        // speak method is coming from domestic animal class since is not
        // available under the Animal class
    }
}
