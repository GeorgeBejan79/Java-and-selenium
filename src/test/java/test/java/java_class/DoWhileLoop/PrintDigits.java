package test.java.java_class.DoWhileLoop;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        /*Print all the digits from given number
    345436
    675
    98678546879
    While the number is bigger than 0 remainder with 10 then and print it then divide with 10*/
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter number ");
        int num= input.nextInt();
        int sum = 0;
        int multiple=1;
        while(num>0){

            int digits = num%10;
           sum+=digits;
           multiple*=digits;
                System.out.println(digits);   //Interview question
            num=num/10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+multiple);
    }
}
