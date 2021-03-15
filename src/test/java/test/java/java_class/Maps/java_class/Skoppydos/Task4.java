package test.java.java_class.Skoppydos;

public class Task4 {

    public static void main(String[] args) {
        int digits = 578432;
        int num1= digits%10;  //2

        int remainder=digits/10; //57843

        int num2=remainder%10; // 3

        remainder=remainder/10; // 5784

        int num3=remainder%10; //4

        remainder=remainder/10; //578

        int num4=remainder%10;  //8

        remainder=remainder/10;  //57

        int num5=remainder%10;  //7

        remainder=remainder/10; //5

        int num6=remainder;  //5

        int multiplication=num1*num2*num3*num4*num5*num6;
        System.out.println("Multiplication of all digits is "+multiplication);
        int sum=num1+num2+num3+num4+num5+num6;
        System.out.println("Sum of all digits is: "+sum);
    }
}
