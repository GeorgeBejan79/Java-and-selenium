package test.java.java_class.Homework12;
import java.util.Scanner;
public class Hwk12TskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Please insert a number you want to check ");
        int number= input.nextInt();
        //System.out.println("Number you entered is "+number);
        int reverse=0;
        boolean isPalindrome =true;
        String strValue1=String.valueOf(number);
        String StrValue2=Integer.toString(number);
            System.out.println(strValue1);

        char[] ch = new char[strValue1.length()];
        for (int i = 0; i < strValue1.length(); i++) {
            ch [i] = strValue1.charAt(i);

            for (int j = strValue1.length(); j >=0 ; j--) {
                if(ch[i]!=ch[j]){
                    isPalindrome=false;
                }else{
                    isPalindrome=true;
                }
            }
        }
        System.out.println(isPalindrome);
    }
}
