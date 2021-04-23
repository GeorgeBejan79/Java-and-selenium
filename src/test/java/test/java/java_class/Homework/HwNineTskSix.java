package test.java.java_class.Homework;
import java.util.Scanner;
public class HwNineTskSix {
    public static void main(String[] args) {
        /*Write a program in Java to check whether a String is a palindrome
    or not.
    Test Data :
    Input a number: Civic
    Expected Output :
    Civic is palindrome
    NOTE:
    A string is said to be a palindrome if the string read from left to right
    is equal to the string read from right to left. For example, ignoring
    the difference between uppercase and lowercase letters,the string "iTopiNonAvevanoNipoti" is a palindrome,*/
        Scanner input=new Scanner(System.in);
            System.out.println("Input a string: ");
        String str=input.nextLine();
        String reverse="";

        for(int i = str.length()-1; i >= 0; i--){

            reverse = reverse.concat(str.charAt(i)+"");
            //---or   reverse+=str.charAt(i);   --//
        }
        if(reverse.equalsIgnoreCase(str)){
            System.out.println("is a palindrome");

        }else{
            System.out.println("is not a palindrome");
        }
    }
}
