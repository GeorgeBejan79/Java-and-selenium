package test.java.java_class.OOP.Inheritance;
public class DomesticAnimal extends Animal{
    public void speak(){
        System.out.println("DAnimal is speaking");

    }
    //Method Overriding--> using method overriding we can update&change the implementation for methods from parent class
        @Override
        public void run(){
            System.out.println("Domestic animal is running.");
        }

    public static void main(String[] args) {
               DomesticAnimal dAnimal = new DomesticAnimal();
        dAnimal.run();
        dAnimal.speak();

        Animal animal=new Animal();
        animal.run();
        //animal.speak();--> speak method is not available for parent class.


    }
}
