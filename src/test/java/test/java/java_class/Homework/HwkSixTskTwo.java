package test.java.java_class.Homework;
import java.util.Scanner;
public class HwkSixTskTwo {
    public static void main(String[] args) {
        /*Using scanner ask user to enter any String value. If this String
        has the color like red or blue with lower case print the red or blue.
        EXAMPLE-1:
        Input: "xxredyy"
        Output: red
        EXAMPLE-2:
        Input: "xbxltue"
        Output: blue */
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();

        if(str.contains("r")&&str.contains("e")&&str.contains("d")){
            System.out.println("red");
        }
        else if(str.contains("b")&&str.contains("l")&&str.contains("u")&&str.contains("e")){
            System.out.println("blue");
        }else{
            System.out.println("none");
        }
    }
}
