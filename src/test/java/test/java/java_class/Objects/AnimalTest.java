package test.java.java_class.Objects;
public class AnimalTest {
    public static void main(String[] args) {
        Animal cat =new Animal(); //created the object cats
        cat.name = "Dodo";
        cat.age=3;

        cat.speak();
        cat.sleep();// call method sleep
            System.out.println("cat energy "+cat.energy);
        Animal dog = new Animal();
        dog.name = "Pars";
        dog.age = 5;
        dog.color = "Brown";

            System.out.println(dog.name);
            System.out.println(dog.age);
            System.out.println(dog.color);
            System.out.println(dog.energy);
        dog.speak();
        dog.sleep();
            System.out.println("Dog energy " + dog.energy);
        dog.speak();

        Animal bird =new Animal();
        bird.name="Twit";
        bird.age=2;
        bird.color="blue";
        bird.energy = 50;
        bird.speak();
     while(bird.energy>0){
        bird.run();}
        bird.sleep();
        System.out.println(bird.energy);
        while(bird.energy>0){
            bird.run();}
    }

    }

