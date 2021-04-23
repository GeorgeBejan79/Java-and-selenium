package test.java.java_class.Homework;
import java.util.Scanner;
public class HwEightTskTwo {
    public static void main(String[] args) {
        /*Using a scanner ask the user to provide starting and ending numbers. Print the numbers
    divisible by 3 and 5 between given number AND print count of those numbers which is
    divisible by 3 and 5.
    EXAMPLE:
    First number: 5
    Second number: 65
    Output:
    15
    30
    45
    60
    Total number that divisible by 3 and 5 is 4.*/
        Scanner input = new Scanner(System.in);

            System.out.println("First number:");
        int firstNum = input.nextInt();

            System.out.println("Second number:");
        int secondNum = input.nextInt();
        int count=0;
        int num =firstNum;

        for (num = firstNum; num<=secondNum;num++){
            if(num%3 == 0 && num % 5 == 0){

                System.out.println(num);
                count++;
            }
        }
        System.out.println("Total number that divisible by 3 and 5 is "+count);
    }
}
