package test.java.java_class.IfStatements;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

            System.out.println("Please enter jersey number: ");
        int number =scanner.nextInt();

        if(number < 0  ){

            System.out.println("It is invalid number");
        }else if(number % 2 == 0){

            System.out.println("Your jersey number is even number ");
        }else{

            System.out.println("Your jersey number is odd number");
        }
    }
}
