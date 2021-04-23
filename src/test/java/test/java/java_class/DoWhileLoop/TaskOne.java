package test.java.java_class.DoWhileLoop;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        /*
        TASK:
    Using scanner ask user to provide one string value then print this string in following format. Add the X at the end of the String until string length is 20.
    "test"
    testX
    testXX
    testXXX
    ..
    ..
    ..
    testXXXXXXXXXXXXXXXX */
        Scanner input =new Scanner(System.in);
        String str= input.next();
        while(str.length()<19){        // exemple 1

             str=str.concat("X");
            System.out.println(str);
        }//-----------------------------------------------
        int num=str.length();
        String str1 ="Test";
        while(num<20){
                                     // example 2
            str1=str1.concat("X");
                System.out.println(str1);
            num++;
        }
    }
}
