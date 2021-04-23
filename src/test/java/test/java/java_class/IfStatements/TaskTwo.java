package test.java.java_class.IfStatements;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        /*
        if the time is between 6am to 12 (6,7,8,9,10,11) pm print Good Morning
        if the time is between 12pm to 6pm (12,13,14,15,16,17,18) print Good Afternoon
        * */
        Scanner input =new Scanner(System.in);

            System.out.println("Please enter time: ");
        int time = input.nextInt();

        if(time <= 11 && time >= 6){

            System.out.println("good morning");
        }
        if(time >= 12 && time <= 18){

            System.out.println("good afternoon");
        }
    }
}
