package test.java.java_class.StringBuilderPr;
import java.util.Scanner;
public class withoutX2 {
    public static void main(String[] args) {
        System.out.println("Enter your str: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //System.out.println("Enter your index: ");
        //int index=input.nextInt();
        String newStr = "";
        int size = str.length();
        /*for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch=='x'){

                newStr+="";
            }else{
                newStr+=str.charAt(i);
            //System.out.print(str.charAt(i));
        }}*/
        //newStr+=""+str.charAt(0)=="x";
        String ch1;
        String ch2;
        String ch3;
        String chLast;
        if (size == 0) {
            newStr += "";
        }
        if (size == 1){
            ch1 = "" + str.charAt(0);
            if (str.equals("x")) {
                newStr += "";
         }else{
                newStr+=str;
            }
        }
        if (size == 2) {
            ch1 = "" + str.charAt(0);
            ch2 = "" + str.charAt(1);
            if (ch1.equals("x") && ch2.equals("x")) {
                newStr += "";
            }
            if (!str.startsWith("x") && !str.endsWith("x")) {
                newStr += str;
            }
        }
        if (size == 3) {
            ch1 = "" + str.charAt(0);
            ch2 = "" + str.charAt(1);
            ch3 = "" + str.charAt(2);
            chLast=""+str.charAt(str.length()-1);
            if (ch1.equals("x") && !chLast.equals("x")) {
                newStr += str.substring(1, str.length());
            }
            if (!ch1.equals("x") && !chLast.equals("x") && ch2.equals("x")) {
                newStr += ch1 + chLast;
            }
            if (!ch1.equals("x")  &&ch3.equals("x") && !ch2.equals("x") ){

                newStr += str;
            }
        }
        if (size == 4) {
            ch1 = "" + str.charAt(0);
            ch2 = "" + str.charAt(1);
            if(ch1.equals("x")&&ch2.equals("x")){
                newStr += str.substring(2,str.length()); // need
        }
            if(ch1.equals("x") && !ch2.equals("x")){
                newStr+= str.substring(1, str.length());
            }
        }
        if(size > 4){
            ch1 = "" + str.charAt(0);
            chLast=""+str.charAt(str.length()-1);
            if(ch1.equals("x")&& !chLast.equals("x")){
                newStr+=str.substring(1,str.length());
            }
            else{
                newStr+=str;
            }
        }
        System.out.println(newStr);
        System.out.println(size);
    }
}

