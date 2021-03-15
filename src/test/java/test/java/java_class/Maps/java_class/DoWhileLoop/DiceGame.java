package test.java.java_class.DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        // 12, 6
        // we will roll the dices until some of the dice equals with user inputs
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number between 2 and 12");
        int num = input.nextInt();
        //while sum of the dices are not equals to given number qeep rolling the dices
        // to roll the dices
        //first roll dices
        int sum;
        int count=0;
        int balance =100;
        do{
        int dice1 = random.nextInt(6); // 0-5
        int dice2 = random.nextInt(6);
         sum = ++dice1 + ++dice2;
            System.out.println("Dice One is "+dice1+" Dice Two is "+dice2);
            count++;

            if(count<=5 && sum==num) {
                balance += 200;
                System.out.println("You earned $200. ");
            }else{
                balance-=10;
                System.out.println("You give me $10");
            }
        }while(sum != num && count < 5);
        System.out.println("balance is "+balance);
        System.out.println("You have rolled the dice "+count+" times to find the "+num);
    }
}