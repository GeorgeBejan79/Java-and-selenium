package test.java.java_class.Primitives;

public class Farm {

    public static void main(String[]args){

        int cows=23, chickens=42, cowsPrice=1253, chickensPrice=11;

        int totalLegs=chickens*2+cows*4;

        int totalPrice=chickens*chickensPrice+cows*cowsPrice;

        System.out.println("Total number of les int the farm is: "+totalLegs);
        System.out.println("Total price for all the farm animals is: "+totalPrice);

    }
}
