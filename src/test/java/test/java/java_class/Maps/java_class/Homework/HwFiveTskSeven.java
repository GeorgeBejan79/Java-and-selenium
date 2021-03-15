package test.java.java_class.Homework;
import java.util.Scanner;
public class HwFiveTskSeven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*   Write a Java program to get a number from the user and print whether it is
        positive or negative.
                Input number: 35
        Output :Number is positive  */
            System.out.println("Please enter a number: ");
        int num = input.nextInt();
            System.out.println("Input number number: "+num);
        if(num >= 0){
            System.out.println("Number is positive ");
        }else{
            System.out.println("Number is negative ");
        }

    }
}
