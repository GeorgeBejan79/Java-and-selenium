package test.java.java_class.Sets.StringExample;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a name city ");
        String cityName = input.nextLine();
        //chicago
        //new york
        //everytime --> last char index number =length-1
        int length = cityName.length();// it will return length of the
        System.out.println(cityName.charAt(length - 1));//last char
        System.out.println(cityName.charAt(0));// first char
        System.out.println(cityName.length());
        System.out.println(cityName.charAt(length / 2)); //middle char
        System.out.println(cityName.indexOf("g")); //5
        System.out.println(cityName.indexOf("c", cityName.indexOf("c")+1));

        /*String test ="STRING T";
        int in = test.indexOf("T", test.indexOf("T")+1);
        System.out.println(in);*/
    }
}
