package test.java.java_class.Homework;
import java.util.Scanner;
public class HwkSixTskFour {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Given a string, if a length 2 substring appears at both its
    beginning and end, print a string without the substring at the
    beginning, so "HelloHe" yields "lloHe". The substring may overlap
    with itself, so "Hi" yields "". Otherwise, print the original string
    unchanged.
    Example:
    "TestTe" --> print stTe
    "TestTi" --> print TestTi*/
        System.out.println("Please insert a string: ");
        String str = input.next();
        String firstStr = str.substring(0,2);
        String secondStr =str.substring(2,str.length()-2);
        String thirdStr = str.substring(str.length()-2);

        if(firstStr.equals(thirdStr)){
            System.out.println(secondStr+""+thirdStr);
        }else{
            System.out.println(str);
        }
    }
}
