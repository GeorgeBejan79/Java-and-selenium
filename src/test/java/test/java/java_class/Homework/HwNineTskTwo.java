package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskTwo {
    public static void main(String[] args) {
        /*Test Data :
    Input the starting range or number : 1
    Input the ending range of number : 50
    Expected Output :
    The Perfect numbers within the given range : 6 28
    NOTE: you need to use the nested loop.*/
        Scanner input=new Scanner(System.in);
        System.out.print("Please insert a number to check ");
        int number = input.nextInt(); // interview question//--------------------
        int sum = 1;

        for(int num = 2; num <= number/2; num++ ){ // num<=number/2 will run half times because after 250 is no divisor
            if(number % num == 0){                 //otherwise the code will run 498 times

                sum+=num;
            }
        }
        if(sum == number){
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}