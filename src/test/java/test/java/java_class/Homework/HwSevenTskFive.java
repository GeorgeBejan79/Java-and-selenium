package test.java.java_class.Homework;
import java.util.Scanner;
public class HwSevenTskFive {
    public static void main(String[] args) {
        /* Write the program to check whether a character is an alphabet,
    digit or special character. NOTE: you can use the ascii numbers to
    check the value of the character.
    Test Data :
    @
    Expected Output :
    This is a special character.*/
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter any character:");

        char character = input.next().charAt(0);

        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            System.out.println(character + " is an alphabet character.");

        } else if (character > '0' && character < '9') {
            System.out.println(character + " is a digit.");

        } else {
            System.out.println(character + " is a special character.");

        }
    }
}


