package test.java.java_class.IfStatements;
import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

            System.out.println("Please enter number 1: ");
        int num1 = input.nextInt();
            System.out.println("Please enter number 2: ");

        int num2 = input.nextInt();
            System.out.println("Please enter number 3: ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){

            System.out.println(num1);
        }else if(num2>num1&&num2>num3){

            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
