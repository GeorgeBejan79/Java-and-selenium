package test.java.java_class.Homework;
import java.util.Scanner;
public class HwSevenTskTwo {
    public static void main(String[] args) {
        /*Write a Java program that takes the user to provide a single
        character from the alphabet. Print Vowel or Consonant,
        depending on the user input. If the user input is not a letter
        (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        Input an alphabet:
        p
        Expected Output :
        Input letter is Consonant*/
        /*Scanner input= new Scanner(System.in);
        System.out.println("Input an alphabet: ");*/
        int a=0;
        Scanner sc=new Scanner(System.in);
            System.out.println("Input an alphabet:");
        char ch=sc.next( ).charAt(0);
        if(ch =='a'||ch =='e'||ch =='o'||ch =='i'||ch =='u'){
            System.out.println("Input letter is Vowel");

        }else if(ch>='a' && ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println("Input letter is Consonant");

        }else {
            System.out.println("Not an alphabet");
        }
    }
}




