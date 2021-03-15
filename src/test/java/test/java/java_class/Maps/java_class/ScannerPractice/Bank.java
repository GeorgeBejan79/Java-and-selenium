package test.java.java_class.ScannerPractice;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double deposit = 100;
            System.out.println("What is your deposit amount? ");
        deposit+=input.nextDouble();
            System.out.println("your balance is  "+deposit);
            System.out.println("Please enter the amount deposited:" );
        deposit+=input.nextDouble();
            System.out.println("Please enter the amount deposited:" );
        deposit+=input.nextDouble();
            System.out.println("Please enter the amount deposited:" );
        deposit+=input.nextDouble();
            System.out.println("How much money you spend on your Computer: ");
        deposit-=input.nextInt();
            System.out.println("How much money you spend on your phone: ");
        deposit-=input.nextInt();

                System.out.println("Your balance is: "+"$"+deposit);
    }
}
