package test.java.java_class.strings;

import java.util.Scanner;

public class
CodingBatPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string here");
        String str = input.nextLine();
        int x = str.indexOf('x');
        int afterZ= str.indexOf('z');
        boolean xyzThere = false;
        for (int i = 0; i < str.length(); i++) {
            if (x != 0 && str.contains("xyz") && (str.charAt(x - 1) != '.') && str.charAt(afterZ + 1) != '.') {
                xyzThere = true;
            }
        }
        System.out.println(xyzThere);
    }
}
