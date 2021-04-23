package test.java.java_class.Objects;
public class Horse {
    //While we are creating the blueprint of the object
    //We don't need to use main method
    String name;
    int age;
    char gender;
    double weight;
    double height;
    String color;

    public static void main(String[]args){
        Horse horse1=new Horse();
        horse1.name="Mustang";
        horse1.age=3;
        horse1.gender='M';
        horse1.weight =2.2;
        horse1.height=4.9;
        horse1.color="brown";
        System.out.println(horse1.name);    //gives name to the horse
        System.out.println(horse1.age);
        System.out.println(horse1.gender);
        System.out.println(horse1.color);

        Horse horse2=new Horse();
        horse2.age=8;
        System.out.println(horse2.age);

    }
}
