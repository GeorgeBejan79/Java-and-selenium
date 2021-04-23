package test.java.java_class.Sets.StringExample;
import java.util.Scanner;
public class CodingBat {
    public static void main(String[] args) {
/*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        int size = str.length();
        boolean bobThere = false;
        if (str.length() < 3) {
            System.out.println(false);
        }
        if (size == 3) {
            if (str.charAt(0) == 'b' && str.charAt(2) == 'b') {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        if (size > 3) {
            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'&&(i+2)<size) {
                    bobThere = true;
                }
            }
            System.out.println(bobThere);
        }
    }
}

