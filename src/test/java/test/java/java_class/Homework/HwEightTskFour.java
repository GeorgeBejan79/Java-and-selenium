package test.java.java_class.Homework;

import java.util.Scanner;

public class HwEightTskFour {
    public static void main(String[] args) {
        /*Using the scanner ask the user to provide String value. Then replace all the
char of the String with 'a' using loop and print in every step.
For example:
Input: Success

Output:
"auccess"
"aaccess"
“aaacess”
...
“aaaaaaa”*/
        Scanner input =new Scanner(System.in);
            System.out.println("Please provide a string: ");
        String str =input.next();
        String st1="";
        int lastIndex=str.length()-1;
        int num = 0;
        int firstIndex=0;
        while(num<=lastIndex){

            firstIndex+=1;
            st1 = st1.concat("a");
                System.out.print(st1);
                System.out.println(str.substring(firstIndex));
            num++;
        }
    }
}
