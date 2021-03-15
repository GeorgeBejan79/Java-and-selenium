package test.java.java_class.ScannerPractice;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // shortcut to import  Alt+ Enter

            System.out.println("What is your height? ");
            double height = input.nextDouble();
                System.out.println("what is your weight");
                int weight =input.nextInt();

                    System.out.println("The height is " + height);
                    System.out.println("The weight is " + weight);

    }
}
