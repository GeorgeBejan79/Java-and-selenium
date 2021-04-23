package test.java.java_class.Homework;
import java.util.Scanner;
public class HwEightTskOne {
    public static void main(String[] args) {
        /*Using Scanner ask user to provide any int number and print
    multiplication table of given number
    Input number: 5
    Output :
    5 * 1 = 5
    5 * 2 = 10
    5 * 3 = 15
    ...
    ...
    5*10 = 50*/
        Scanner input =new Scanner(System.in);
        System.out.println("Please insert a number");
        int num = input.nextInt();
        int num1 = 1;
        int product =1;
        while(num1 <= 10){
            product = num * num1;
            System.out.println(num+" * "+num1+" = "+product);
            num1++;
        }
    }
}
