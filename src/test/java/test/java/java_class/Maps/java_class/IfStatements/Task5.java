package test.java.java_class.IfStatements;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("please enter a number");
        int num = input.nextInt();

        if (num > 10) {
            System.out.println("bigger than 10");
        } else if (num > 8) {
            System.out.println("Bigger than 8");
        } else if (num > 4) {
            System.out.println("bigger than 4");
        } else if (num == 4) {
            System.out.println("Number is equal to 4");
        }
            else{
            System.out.println("it is less than 4");
        }
    }
}
        // control+z returns to previous erased text