package test.java.java_class.Homework;

import java.util.Scanner;

public class HwEightTskSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input total number of eggs ");
        int totalEggs = input.nextInt();

        int eatenEggs = 0;
        int sum = 0;
        do {
            System.out.println("How many eggs did you eat? ");
            eatenEggs = input.nextInt();
            sum += eatenEggs;
            System.out.println("There are " + (totalEggs - sum) + " eggs left");
        }
        while (sum != totalEggs);
        System.out.println("You finished all the eggs");
    }
}


