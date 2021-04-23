package test.java.java_class.ForLoop;
import java.util.Scanner;
public class RomanNumerals {
    public static void main(String[] args) {
        /*Convert roman number into integer. If roman number is provided convert it to the integer.
SYMBOL       VALUE
I              1
V             5
X             10
L             50
C             100
D             500
M             1000

Input: "XVII"
Output: 17*/
        Scanner input= new Scanner(System.in);
            System.out.print("Please insert an roman numeral: ");
           String str = input.nextLine();

        int len = str.length();
        str = str + " ";
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch   = str.charAt(i);

            if(ch=='M'){
                result+=1000;

            }else if(ch=='D'){
                result+=500;

            }else if(ch=='C'){
                result+=100;

            }else if(ch=='L'){
            result += 50;

            }else if(ch=='X'){
                result += 10;

            }else if(ch=='V'){
                result += 5;

            }else if(ch=='I'){
                result += 1;
            }
        }
        System.out.println("Equivalent Integer: "+result);
    }
}

