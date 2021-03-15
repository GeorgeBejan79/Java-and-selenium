package test.java.java_class.Sets.StringExample;
import java.util.Scanner;
public class PracticeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        boolean hasBad=false;
        String strIndexOfOne=str.substring(1);
        String strIndexOfZero=str.substring(0,2);
        //System.out.println(strIndexOfOne);
        String str1="bad";

         if(strIndexOfOne.equals(str1)||(strIndexOfZero.equals(str1)));{
            hasBad=true;
        }
        //if(hasBad)
        System.out.println(hasBad);
        }


    }


