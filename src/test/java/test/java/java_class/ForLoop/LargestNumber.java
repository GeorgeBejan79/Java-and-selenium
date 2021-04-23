package test.java.java_class.ForLoop;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        * using scanner ask user one number btw 1-10
        * 5
        * num1:
        * num2:
        * num3:
        *
        * */
        Scanner input=new Scanner(System.in);
            System.out.println("Please enter a number");
        int num = input.nextInt();
            System.out.println("num-1");

        int firstNumber=input.nextInt();
        int biggestNum=firstNumber;  // or can be int biggest num=Integer.MIN_VALUE;
        for(int i=2; i <= num; i++){

            //System.out.println("num-"+i);
            int secondNum=input.nextInt();
            if(secondNum>biggestNum){
                biggestNum=secondNum;
            }
        }
        System.out.println("biggest number is: " + biggestNum);
    }
}
