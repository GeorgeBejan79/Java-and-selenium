package test.java.java_class.Homework;

import java.util.Scanner;

public class HwFiveTskSix {
    public static void main(String[] args) {
        /*Using scanner ask user to enter one String value. If this String length is odd
    number print middle 3 string from given value. (You need to use if statement
    for this task)
    Example 1:
    Please enter the String value:
    test
    The output is:
    (Since "test" length is not odd number output should be nothing)
    Example 2:
    Please enter the String value:
    Chicago
    The output is:
    ica
    */
        Scanner input =new Scanner (System.in);
            System.out.println("Please enter a String ");

        String str = input.nextLine();
        int strLength = str.length();
        String str1 = str.substring(((str.length()/2)-1), ((str.length()/2)+2));

        if(strLength % 2!= 0){
            System.out.println(str1);

        }else{
        }
    }
}
