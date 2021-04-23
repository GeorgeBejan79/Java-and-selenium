package test.java.java_class.Homework;
import java.util.Scanner;
public class HwkSixTskThree {
    public static void main(String[] args) {
        /*Given a string, if one or both of the first 2 chars is 'x'
    , print the
    string without those 'x' chars, and otherwise print the string
    unchanged.
    "xHi" → "Hi"
    "Hxi" → "Hi"
    "Tesxt" → "Testxt
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string: ");
        String str = input.nextLine();

        if (str.startsWith("x")) {
            String newStr = str.substring(1, str.length() - 1);
            System.out.println(newStr);

        }else if(str.substring(1,2).equals("x")){
            System.out.println(str.substring(0,1)+""+str.substring(2));

        }else{
            System.out.println(str);
        }
    }
}
