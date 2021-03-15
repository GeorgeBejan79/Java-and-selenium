package test.java.java_class.IfStatements;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 5: ");
        int number = input.nextInt();

            if (number == 1) {
                System.out.println("Monday");
        }
            if (number == 2) {
                System.out.println("Tuesday");
        }
            if (number == 3) {
                System.out.println("Wednesday");
        }
            if(number == 4){
                System.out.println("Thursday");
        }
            if(number == 5){
                System.out.println("Friday");
            }
            if(number<1 || number>5){
                System.out.println("Wrong number"); //if the number is not btw 1-5 I want to print number is not correct
            }
        }
    }

