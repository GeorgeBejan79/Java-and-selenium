package test.java.java_class.Sets.StringExample;
import java.util.Scanner;
public class StringPracticeOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("Please enter a string: ");
        String a=input.nextLine();
            System.out.println("Please enter a string: ");
        String b=input.nextLine();
        /*String extraEnd="";
        if(str.length()>2){
            str=str.substring(str.length()-2, str.length());
             extraEnd=str+str+str;
        }else{
            extraEnd=str+str+str;
        }
        System.out.println(extraEnd);*/
        String comboString="";
        if(a.equalsIgnoreCase("Hello")){
            comboString=b+a+b;
        }else if(b.equalsIgnoreCase("Hello")){
            comboString=a+b+a;
        }else{
            comboString=b+a+b;
        }
        System.out.println(comboString);
    }
}


