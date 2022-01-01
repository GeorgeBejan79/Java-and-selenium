package test.java.java_class.ArraysPractice;

import java.util.Scanner;

public class AnalyzeNumbersArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {

            numbers[i] = input.nextDouble(); //inserts numbers in array
            sum += numbers[i]; //creates sum adding numbers
        }
        double average = sum / n; // calculates average

        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);

    }
}

