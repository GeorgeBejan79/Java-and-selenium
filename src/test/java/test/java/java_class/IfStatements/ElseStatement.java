package test.java.java_class.IfStatements;

import java.util.Scanner;

public class ElseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your balance: ");
        double balance =input.nextInt();

        /*
        * if balance is more than 10000 aply 8% of interest
        * else apply 5% interest print the value after interest rate
        */
        if(balance > 10000){
            double interestAmount = balance * 0.08;
            balance += interestAmount;
                System.out.println("(8%) Balance is: $"+balance);
        }
        else{
            double interestAmount = balance * 0.05;
            balance += interestAmount;
                System.out.println("(5%) Balance is: $"+balance);
        }

    }
}
