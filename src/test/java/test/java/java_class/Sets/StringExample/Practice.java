package test.java.java_class.Sets.StringExample;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
          /*doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
           /* String newStr="";
        for (int i = 0; i < str.length(); i++) {
            newStr+=str.charAt(i)+""+str.charAt(i);
        }
        System.out.println(newStr);*/

        /*catDog("catdog") → true
            catDog("catcat") → false
        catDog("1cat1cadodog") → true*/

            String str1="cat";
            String str2="dog";
            int countDog=0;
            int countCat=0;
            boolean containsDogCat=false;
        for (int i = 0; i < str.length(); i++) {
            if(str.contains(str1)){
                //countCat=1;
            }
            countCat++;
        }
        System.out.println(countCat);

    }
}
