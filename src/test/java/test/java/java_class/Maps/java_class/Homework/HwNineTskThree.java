package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskThree {
    public static void main(String[] args) {
        /*Write a Java program to check whether a given number is an
    armstrong number or not.
    Test Data :Input a number: 153
    Expected Output :153 is an Armstrong number.
    NOTE:
    An Armstrong number, also known as narcissistic number, is
    a number that is equal to the sum of the cubes of its own digits. For
    example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 +
    0*0*0*/
        Scanner input=new Scanner(System.in);
            System.out.println("Enter a number:");
        int actualNum=input.nextInt();
        int num = actualNum;
        int digit = 0;
        int cube = 1;
        int sum = 0;
        // number=370
        // use charAt to get 3, 7, 0 and cube and sum them-----------------------
        for(; num > 0; ){

            digit = num % 10;
            num = num/10; // 37 3 0
            cube = digit * digit * digit;  // version with for loop
            sum = sum + cube;
        }//--------------------------------------------------------------
        /*while(num > 0){
            digit = num % 10; // extract digits 0, 7, 3
             //System.out.println("digits are: "+digit);
            num = num/10; // 37 3 0
            cube = digit * digit * digit; // product of digits 0*7*3 for provided number 370
            sum =  sum + cube;  //sum+=cube        // calculates sum of cubes
        }*///----------------------------------------------------------------------------------

        if(sum == actualNum){           // check if the sum of cubes equals provided number
            System.out.println(actualNum+" is an Armstrong number.");
        }else{
            System.out.println(actualNum+" is not an Armstrong number.");
        }
    }
}
