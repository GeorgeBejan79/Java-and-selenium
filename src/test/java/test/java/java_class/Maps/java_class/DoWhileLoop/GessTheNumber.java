package test.java.java_class.DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GessTheNumber {
    public static void main(String[] args) {
        //Random class will create random numbers
        //Scanner input=new Scanner(System.in);
        Random random =new Random();
        int randomNumber = random.nextInt(101);///generate random number btw o and 100
        Scanner input = new Scanner(System.in);
        int number=0;
        int count=0;
        /// 55
        do{
            System.out.println("please guess num btw 0-100");
            number =input.nextInt();

            if(number <randomNumber){
                System.out.println("the number is less than random number ");

            }else if(number >randomNumber){
                System.out.println("the number is more than random number ");
            }
            count++;
        }while(number!=randomNumber && count < 5);
            System.out.println("the random number is "+randomNumber);
            System.out.println(count);
    }
}
