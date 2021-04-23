package test.java.java_class.Skoppydos;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please insert a string");
        String str = input.next();
        String reverse=" ";
        for (int i=str.length()-1;i>0;i--){
            System.out.print(str.charAt(i));
            reverse+=str.charAt(i);

        }
        System.out.println(reverse.trim());
    }
}
