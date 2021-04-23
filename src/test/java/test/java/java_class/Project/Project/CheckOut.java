package test.java.java_class.Project.Project;


import java.util.Scanner;

public class CheckOut {
    public String paymentOption (String payment){
        Scanner input=new Scanner(System.in);
        System.out.println("Select payment option. Credit card, debit, bitcoin, Paypal: ");
        String option = input.nextLine();
        if(option.equalsIgnoreCase("Credit card")){
            System.out.println("Please enter your card info");
        }if(option.equalsIgnoreCase("debit")){
            System.out.println("Please enter your card info");
        }
        if(option.equalsIgnoreCase("bitcoin")){
            System.out.println("Please enter your info");
        }
        if(option.equalsIgnoreCase("Paypal")){
            System.out.println("Please enter your username and password");
        }
        return option;
    }

}
