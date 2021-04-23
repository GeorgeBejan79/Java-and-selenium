package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskFour {
    public static void main(String[] args) {
        /*Write a program in Java to find the prime numbers within a
    range of numbers.
    Test Data :Input starting number of range: 1
    Input ending number of range : 50
    Expected Output :
    The prime number between 1 and 50 are :
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    NOTE: you need to use the nested loop.
    _______________________________________________________________________________________
     int x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the range. Give the first number of the range: ");
        x1 = scanner.nextInt();
        System.out.println("Please enter the highest number of the range now: ");
        x2 = scanner.nextInt();
        for(int currentNumber = x1; currentNumber <= x2; currentNumber++){
            int counter = 0;
            for(int i = 2; i < currentNumber/2; i++){
                if(currentNumber % i == 0) {
                    counter++;
                }
            }
            if(counter == 0)
                System.out.println("Found prime number, which is " + currentNumber);}
     -------------------------------------------------------------------------------------------*/
        Scanner input = new Scanner(System.in);
            System.out.println("Enter range min");
        int min = input.nextInt();
            System.out.println("Enter max range");
        int max = input.nextInt();

        for (int number = min + 1; number < max; number++) {
            int count = 0;
            for (int i = 2; i < number / 2; i++){
                if(number % i == 0)
                    count++;
            }
            if(count == 0)
                System.out.print(number + " ");
        }
        System.out.println(" Prime Number");
    }
}