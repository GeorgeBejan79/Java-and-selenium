package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskFive {
    public static void main(String[] args) {
        /*Write a program in Java to display the any number in reverse order.
        Test Data :
        Input a number: 12345
        Expected Output :
        The number in reverse order is : 54321*/
        Scanner input=new Scanner(System.in);
            System.out.println("Input a number:");
        int num= input.nextInt();

        /*int first = num % 10;
            System.out.print(first);
        int reminder =num / 10;
        int second =reminder % 10;
            System.out.print(second);
        reminder = reminder / 10;
        int third = reminder % 10;
            System.out.print(third);
        reminder = reminder / 10;
        int fourth = reminder % 10;
            System.out.print(fourth);
        reminder = reminder / 10;
        int fifth = reminder % 10;
            System.out.print(fifth);*/
        int reverse = 0;
        while(num>0 );{
            reverse=reverse*10+num%10;
            num/=10;
        }
        System.out.println(reverse);
    }
}
