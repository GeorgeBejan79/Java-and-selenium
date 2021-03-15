package test.java.java_class.DoWhileLoop;
import java.util.Scanner;
public class PrintDigitsBiggerThan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("please insert a number: ");
        int num =input.nextInt();

        int sum=0;

        while(num>0){               // checks if numbers are positive
        int digits = num % 10;      // finds digits from end to beginning
        if(digits>5){               // if digits are bigger than 5
             sum+=digits;           // adds them to sum
        }
            num = num/10;           //new number without last digit
        }
        System.out.println("Sum is:"+sum);
    }
}
