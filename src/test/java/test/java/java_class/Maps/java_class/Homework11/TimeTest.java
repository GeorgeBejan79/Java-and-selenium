package test.java.java_class.Homework11;
import java.util.Scanner;
public class TimeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ******Welcome****** ");
        System.out.println("Please enter a number baby");
        TimeTest time = new TimeTest();
        TimeTest date = new TimeTest();
        TimeTest timeAndDate = new TimeTest();
        int exit = -1;

        do {
            int getInstruction = input.nextInt();
            int number= input.nextInt();
            switch (getInstruction) {
                case 1:
                    System.out.println("Press 1 to create a time");

                    break;
                case 2:
                    System.out.println("Press  2 to create a date");
                    number= input.nextInt();
                    break;
                case 3:
                    System.out.println("Press 3 to create date and a time");
                    number= input.nextInt();
                    break;
                case 4:
                    System.out.println("Press 4 to update a time");
                    number= input.nextInt();
                    break;
                case 5:
                    System.out.println("Press 5 to update date");

                    break;
                case 6:
                    System.out.println("Press 6 to print time information");
                    break;
                case 7:
                    System.out.println("Press 7 to print date information");
                    break;
                case 8:
                    System.out.println("Press 8 to print  date and a time information");
                    break;

                case 9:
                    exit = 9;
                    break;
            }
        } while (exit != 9);
        System.out.println("Thank you and happy new year baby");
    }
}

