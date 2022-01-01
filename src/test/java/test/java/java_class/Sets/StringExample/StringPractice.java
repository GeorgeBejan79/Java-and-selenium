package test.java.java_class.Sets.StringExample;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first string: ");
        String str = input.nextLine();
        //System.out.println("Please enter second string: ");
        //String b = input.nextLine();
        int size = str.length();
        String strReturn = "";
        String str1 = "";
        String str2 = str.substring(str.length() - 2, str.length());
        if (size == 1) {
            str1 += str;
            System.out.println(str1);
        } else {
            str1 = str.substring(0, 2);
            System.out.println(str1);
            if (size == 2) {
                strReturn = "";
            }
            if (size == 3) {
                strReturn += str.substring(size - 1);
            }
            if (str1.equals(str2)) {
                strReturn = str.substring(2, str.length());
            }
        }


        System.out.println(strReturn);

    }

    //System.out.println(str1);
        /*String str1=str.substring(0,2);
        int size=str.length()-1;
        String str2=str.substring(str.length()-2,str.length());

        boolean frontAgain=true;

            if(size==0){
                frontAgain=false;
            }if(size==1){
                frontAgain=false;
            }if(size>2) {
                if (str1.equals(str2)) {

                    frontAgain = true;
                }
            }
        System.out.println(frontAgain);
        }*/

}



