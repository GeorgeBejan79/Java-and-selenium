package test.java.java_class.Skoppydos;

import java.util.Scanner;

public class PracticeFive {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
            System.out.println("Please enter a number btw 1 and 10 ");
        int num=input.nextInt();
        for(int i=num; i>0; i--){
            System.out.println(i);

            for(int j=1;j>0; j--){
            System.out.println(j);
        }
            System.out.println();
        }
    }
}
