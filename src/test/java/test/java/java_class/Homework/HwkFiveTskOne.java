package test.java.java_class.Homework;
import java.util.Scanner;
public class HwkFiveTskOne {
    public static void main(String[] args) {
        /*Write the program to get the string value from the specified position. First,
    ask the user to enter one String value. Then ask the user the enter starting
    number and ending number. After that, print the value between the given
    starting and ending numbers. (Note: since the user does not know the java,
    the user starts counting from 1 and ending number will be included)
    Example:
    Please enter the String value:
    Definition of Science
    Please enter the starting number:
    2
    Please enter the ending number
    5
    The output is:
    efin   */
        Scanner input =new Scanner(System.in);
            System.out.println("Please enter a string: ");
        String str = input.nextLine();
            System.out.println("Please enter starting number: ");
        int num1 = input.nextInt();
            System.out.println("Please enter ending number: ");
        int num2 = input.nextInt();
        str = str.substring( num1, num2 );
            System.out.println(str);
    }
}
