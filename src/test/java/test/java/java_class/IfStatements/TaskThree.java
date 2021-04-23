package test.java.java_class.IfStatements;
import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("Please enter time: ");
        //double time = input.nextInt();
        //.out.println("Please enter am or pm");
        String time = input.nextLine();

        if (time.endsWith("am")) {

            System.out.println("good morning");
        }
        if (time.endsWith("pm")) {

            System.out.println("good afternoon");
        }
    }
}