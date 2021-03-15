package test.java.java_class.Homework;
import java.util.Scanner;

public class HwSixTskFive {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /* Write a Java program that takes a year from user and print
        whether that year is a leap year or not.
        Input the year: 2016
        Output :2016 is a leap year

        */
        System.out.println("Please enter a year");
        int year= input.nextInt();
        if(year%4 ==0){
            System.out.println("Is leap year");

        }else if(year%100 ==0){
            System.out.println("Not a leap year");
        }else if(year%400==0){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
