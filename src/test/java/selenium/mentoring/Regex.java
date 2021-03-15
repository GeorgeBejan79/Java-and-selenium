package selenium.mentoring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Regex {
    public static void main(String[] args) {


        String str = "techtorial";
        String lowerLetter="l";
        String regex = "";
        String upperCase = "L";
        String specialCharacter = ",";
        String number = "8";
        String anyCharacter = ".";

        //System.out.println(lowerLetter.matches(anyCharacterRegex));
        //System.out.println(lowerLetter.matches(anyCharacterRegex));
        //System.out.println(lowerLetter.matches(anyCharacterRegex));
        //System.out.println(lowerLetter.matches(anyCharacterRegex));
        String word="Techtorial";
        String regexForAnyCharacterAnyTime=".*t.*t.*";
        System.out.println(word.matches(regexForAnyCharacterAnyTime));

        String onlyLetters="[a-zA-Z]*";
        System.out.println(word.matches(onlyLetters));
        String phoneNumber="332-563-4302";
        String regexForPhoneNumber="[0-9]{3}-[0-9]{3}-[0-9]{4}";
        System.out.println(phoneNumber.matches(regexForPhoneNumber));
        String regexFordoesntContain="[^0-9]*";
        System.out.println(word.matches(regexFordoesntContain));

        String str1="sdfaf908084-75qmngfn..vm,";

        String [] arr=str.split("[\\D] ");
        System.out.println(Arrays.toString(arr));

        String str2="Techtorial";
        //string T=2, C=1...

        Map<Character, Integer> cout=new HashMap<Character, Integer>();
        //str2.chars().mapToObj(ch->(char)ch).forEach(ch->cout.put(ch,(cout.containsKey(ch))?
               // count.get(ch)+1 :1 ));

        //String  str3=cout.toString().replace("=",":").replaceAll("[{}]","");
   }
}