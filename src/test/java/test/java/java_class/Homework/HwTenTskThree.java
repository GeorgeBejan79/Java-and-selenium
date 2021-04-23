package test.java.java_class.Homework;
import java.util.Scanner;
public class HwTenTskThree {
    public static void main(String[] args) {
        /*Create one int array with size of 10 without any value. Using scanner ask
    user to provide the int value until you filled out the array with given numbers.
    Then print the array with all numbers.
    Int [] numbers=new int[10];
    Example:
    Please enter the int number. You have 10 space in array:
    11
    Please enter the int number. You have 9 space in array:
    43
    Please enter the int number. You have 8 space in array:
    7   7
   keep continue to ask user until you don't have any space in the array*/
        Scanner input=new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i <=10; i++) {

                System.out.println("Please enter the int number. You have " + (10 - i) + " space in array:");
                numbers[i] = input.nextInt();
            if(10-i==0) {
                break; //outer;
            }
        }
    }
}
