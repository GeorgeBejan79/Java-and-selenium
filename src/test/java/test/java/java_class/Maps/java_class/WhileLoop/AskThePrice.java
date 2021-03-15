package test.java.java_class.WhileLoop;
import java.util.Scanner;
public class AskThePrice {
    public static void main(String[] args) {
        //Phone =500
        //100
        //Please enter 400 more
        //100
        //please enter 300 more
        //300
        // here is the phone
        // input<pricePhone
        Scanner input=new Scanner(System.in);
        System.out.println("Phone price is $500. Please enter the amount: ");
        double userInput =input.nextDouble();//150

        while (userInput<500){
            double requiredAmount =500-userInput;
            System.out.println("Please input "+requiredAmount);
            userInput+=input.nextDouble(); //100
        }
        double exchange = userInput-500;
        System.out.println("Here is the phone. The exchange amount is " + exchange);
    }
}
