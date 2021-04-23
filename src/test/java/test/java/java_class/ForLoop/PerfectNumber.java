package test.java.java_class.ForLoop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
            System.out.print("Please insert a number to check ");
        int number = input.nextInt(); // interview question//--------------------
        int sum = 1;

        for(int num = 2; num <= number/2; num++ ){ // num<=number/2 will run half times because after 250 is no divisor
            if(number % num == 0){                 //otherwise the code will run 498 times

                sum+=num;
            }
        }

        if(sum == number){
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
