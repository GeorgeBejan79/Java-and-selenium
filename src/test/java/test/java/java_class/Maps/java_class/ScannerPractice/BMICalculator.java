package test.java.java_class.ScannerPractice;


import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=input.next();
        input=new Scanner(System.in);
            System.out.println("Please provide your dob:(mm/dd/yyyy) ");
            String dob=input.next();

                System.out.println("Please enter your height and weight for BMI calculation: ");
                System.out.println("height: ");
            double height = input.nextDouble();
                System.out.println("Weight: ");
            double weight = input.nextDouble();

            double bmiResult= weight/(height*height);
        System.out.println("Name: "+name);
        System.out.println("DOB: "+dob);
        System.out.println("Weight: "+height);
        System.out.println("Height: ");
        System.out.println("BMI: "+bmiResult);
        // bmi 18.5 to 24.9
        boolean idealBMI=bmiResult>=18.5 && bmiResult<=24.9;
        System.out.println("Ideal bmi? "+idealBMI);

    }
}
