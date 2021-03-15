package test.java.java_class.Homework;

import java.util.Scanner;

public class HwFiveTskFour {
    public static void main(String[] args) {

        /*Using scanner enter String (two words) value with spaces in the beginning
        and at the end. In this input the second word is not starting with upper case,
                using string methods change the letter with upper case and print it
        Example 1:
        Please enter the String with following format “ word “
        Natural black
        The output is:
        Natural Black*/
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a string with two word ");
        String str = input.nextLine();
        String str1 =str.substring(0, str.indexOf(" ")); //separates string in first word
        String str2 = str.substring(str.indexOf(" ")+1); // finds second word after char " "

        String str3 = str2.toUpperCase(); // create a string with upper case
        String str3First = "" + str3.charAt(0); //create a substring with first letter
        String str3Second = str2.substring(1); // create a string from second letter forward from string number 2
        str3 = str3First + str3Second;

            System.out.println(str1+" "+str3);
    }
}
