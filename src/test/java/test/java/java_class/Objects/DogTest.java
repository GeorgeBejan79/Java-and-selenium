package test.java.java_class.Objects;
public class DogTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Max";
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();
        Dog dog1=new Dog();
        dog1.name="Spike";
        dog1.eat();
        dog1.eat();

        Dog dog2=new Dog();
        dog2.name="Dublin";
        dog2.eat();
        //since the meal is static variable (Class variable)
        //we need to call using class name or when we using the object name it will refer to the same  variables.
        System.out.println(Dog.meal);
        System.out.println(dog1.name);
        System.out.println(dog1.meal);
        System.out.println(dog2.meal);
        Dog.barking();

    }
}
