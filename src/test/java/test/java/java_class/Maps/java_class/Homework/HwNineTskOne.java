package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskOne {
    public static void main(String[] args) {
        /*Write a program in Java to find the sum of the series 1 +11 + 111 +
    1111 + .. n terms.
    Test Data :
    Input the number of terms : 5
    Expected Output :
    1 + 11 + 111 + 1111 + 11111
    The Sum is : 12345
    */
        Scanner  input=new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int usrInput =input.nextInt();
        int num1 = 0;
        int multiplicator=1;

        int sum=1;
        do {
            System.out.print(multiplicator+"+");

            multiplicator=(multiplicator*10)+1;
            num1++;
            sum += multiplicator;
        }
        while( num1 < usrInput-1 );

           System.out.println(multiplicator+" ");
        System.out.println("The Sum is : "+sum);
        }
    }

