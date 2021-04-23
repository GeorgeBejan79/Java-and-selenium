package test.java.java_class.Sets.StringExample;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Please enter your personal information\t: "+
                "\n(Gender -yourFullName - YearofBirth)");
            String info = input.nextLine();
            System.out.println(info.startsWith("F"));
            System.out.println(info.startsWith("M"));
            System.out.println(info.contains("David"));
            System.out.println(info.endsWith("1998"));
    }

}
