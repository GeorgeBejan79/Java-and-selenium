package test.java.java_class.Homework;

import java.util.Scanner;

public class HwFiveTskFive {
    public static void main(String[] args) {
        /* Using scanner ask user to enter one String value. If string length is bigger
        than or equals to 3 print the string without first and last char. If the length is
        not bigger than 3 print print as it is. (for this task you need to use if
            statement).
            Example 1:
                Please enter the String value:
        test
        he output is:
        es
            Example 2:
        Please enter the String value:
        Hello
        The output is:
        ell* */
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter a word: ");
        String str = input.next();
        int strLength = str.length();
        String changeStr = str.substring(1, strLength-1);

        if(strLength < 3){
            System.out.println(str);

        }else{
            System.out.println(changeStr);
        }
    }
}
