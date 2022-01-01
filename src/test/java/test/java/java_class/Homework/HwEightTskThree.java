package test.java.java_class.Homework;
import java.util.Scanner;
public class HwEightTskThree {
    public static void main(String[] args) {
        /* Using scanner ask user to provide the string value. Print "dad" if the given string
    contains the "dad"
    , but where the middle 'a' char can be any char.
    Example:
    Input the year: testdadtest
    Output :dad
    Input the year: testd7dtest
    Output :dad
    Input the year: testdodtest
    Output :dad
    Input the year: testDudtest
    Output :dad */
        Scanner input = new Scanner(System.in);
            System.out.println("Please insert a string");
        String str = input.next();
        int indx1 = str.indexOf('d');       //finds first index of d
        int indx2 = str.indexOf('d') + 2;   //finds second index of d

        char ch = str.charAt(indx1);
        char ch1 = str.charAt(indx2);
        if (ch == ch1) {                //if char at first index of 'd' equals with second one
            System.out.println("dad");  // prints dad otherwise won't
        }
    }
}

