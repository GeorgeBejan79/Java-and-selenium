package test.java.java_class.WhileLoop;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        /*TASK:
print all the letter from a given string

String str="techtorial"

str.charAt(0);
str.charAt(1);
str.charAt(2);
str.charAt(3);
str.charAt(4);
'
strCharAt(str.length-1);*/
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter a string");
        String name= input.nextLine();

        int index=0;
        while(index<name.length()){
            System.out.println(name.charAt(index));
            index++;
        }
        // interview question

        System.out.println("Last char to first char");
        int indexNum=name.length()-1;    //9
        while(indexNum>=0){
            System.out.print(name.charAt(indexNum));
            indexNum--;

        }

    }
}
