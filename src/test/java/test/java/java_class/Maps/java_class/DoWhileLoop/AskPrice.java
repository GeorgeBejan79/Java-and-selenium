package test.java.java_class.DoWhileLoop;

import java.util.Scanner;

public class AskPrice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double userInput=0;
        System.out.println("Phone price is $500. Please enter the amount: ");
       do{
        //double userInput =input.nextDouble();//150
           userInput+=input.nextDouble();
            }
        while(userInput<500);
        System.out.println("Here is your phone.");
    }
}
