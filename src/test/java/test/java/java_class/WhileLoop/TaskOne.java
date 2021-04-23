package test.java.java_class.WhileLoop;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        /*Using scanner ask user starting number and ending number.
print sum of numbers btw starting and ending numbers

starting number
5
ending number
8
5+6+7+8
print
sum=26*/
        Scanner input =new Scanner(System.in);
        System.out.println("Please input the first integer");
        int num1 =input.nextInt();
        System.out.println("Please input the second integer:");
        int num2 =input.nextInt();
        int sum=0;

        while(num1 <= num2){
            //System.out.print(num1+", ");
            num1++;
            if(num1%2!=0) {
                sum += num1;
                System.out.println(num1+",");
            }
        }
        //find sum all old numbers
        System.out.println("Sum of the numbers: "+ sum);
    }
}
