package test.java.java_class.Sets.StringExample;
import java.util.Scanner;
public class CodingBat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        System.out.println("Please enter your word: ");
        String word = input.nextLine();
        int wordSize = word.length();
        int newStrSize = wordSize;
        boolean machString = false;
        String first = "" + str.charAt(0);
        String second = "" + str.charAt(1);
        String newStr = "";
        if (wordSize == 1) {

            if (first.equals(word) || second.equals(word)) {
                newStr += str.charAt(0);
            } else {
                newStr += "";
            }
        }
        if (wordSize == 2) {
            if (first.equals(word) || second.equals(word) || str.startsWith(word)) {
                newStr += str.substring(0, 2);
            } else {
                newStr += "";
            }
        }
        if (wordSize >= 3) {
            if (str.startsWith(word) || str.substring(1).contains(word.substring(1))) {
                newStr += str.substring(0, wordSize);
            } else {
                newStr += "";
            }

            System.out.println(newStr);
            //System.out.println(word.substring(1));
        }//
    }
}

