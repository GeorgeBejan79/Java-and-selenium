package test.java.java_class.ForLoop;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        /*1. Try to solve last homework that we solved in the class using break or continue statements
    2. If number is given, check if the number falls into Fibonacci sequenceâ€¨In fibonacci series,Â next number is the sum of previous two numbersÂ for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1
    3. Convert roman number into integer. If roman number is provided convert it to the integer.*/
        Scanner input=new Scanner(System.in);
        System.out.println(" Please insert and ending number: ");
        int num = input.nextInt();
        int i = 0;
        int j = 1;

        System.out.print("0 1 ");
        for(int z = 0; z <= num; z++){

            z = i + j;
            if(z > 100) // this condition was added to remove values above 100
                break;
                    System.out.print(z + " ");
                    i = j;
                    j = z;
                }
            }
        }


