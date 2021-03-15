package test.java.java_class.OOP.Polymorphism.Foods;

public class Store {
    public static void main(String[] args) {

       Food food = new Carrot();
        System.out.println(food.getDetails());
        System.out.println(food.getPrice());
        System.out.println(((Vegetable)food).color());
        //Vegetable vegetable =(Vegetable)new WholeFood();
        //WholeFood wholeFood=new WholeFood();
        //Vegetable vegetable=new Carrot();

       //

        //it is a relationship
        //since food is a Carrot once we initialise the food
        //we can cast explicitly food to vegetable
        //Because food pointing to the carrot .
        // It is also down casting
        System.out.println(food instanceof Carrot);
        System.out.println(food instanceof Vegetable);
        System.out.println(food instanceof WholeFood);
        System.out.println(food instanceof Food);


    Vegetable vegetable =(Carrot)food;
    vegetable.getName();

    WholeFood wholeFood=new WholeFood();
        System.out.println(wholeFood instanceof Carrot);
        System.out.println(wholeFood instanceof Food);
        System.out.println(wholeFood instanceof WholeFood);

        Vegetable vegetable1=new Carrot();
        vegetable1.getDetails();
        ((Carrot)vegetable1).test();
    }
}
