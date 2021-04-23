package test.java.java_class.Homework;

import java.util.Scanner;

public class HwNineTskSeven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
              /*13. Write a program in Java to make such a pattern like a pyramid with numbers
    increased by 1. For this task ask the user to enter a number of the line.
    Example:
    Please enter line number:
    4
    Expected output:
    1
    2 3
    4 5 6
    7 8 9 10
    NOTE: You need to use the nested loop*/
        int count=1;

        for(int i=1; i<=4; i++){

            System.out.println();
           for(int j = 1; j <= i; j++){

               System.out.print(count+" ");
               count++;
           }

        }
    }
}
