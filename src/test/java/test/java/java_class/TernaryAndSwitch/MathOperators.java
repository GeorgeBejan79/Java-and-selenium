package test.java.java_class.TernaryAndSwitch;

import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /* using scanner ask user to input two int values and ask the name of the operator like multiple, divide, subtract addition
    if name operator is matching then apply given operator to the these two numbers

    please enter first num:
    30
    Please enter second num
    10
    What is operator name?
    Multiple
    output
    300 */
            System.out.println("please enter first num");
        int num1=input.nextInt();
            System.out.println("please enter second num");
        int num2=input.nextInt();
            System.out.println("what is operator name");
        String operator =input.next();
        switch(operator) {

            case "multiplication":
                System.out.println(num1 * num2);
                break;
            case "addition":
                System.out.println(num1 + num2);
                break;
            case "divide":
                System.out.println(num1 / num2);
                break;
            case "subtract":
                System.out.println(num1 - num2);
                break;
        }
    }
}
