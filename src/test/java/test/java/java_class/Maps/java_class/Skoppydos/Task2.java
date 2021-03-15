package test.java.java_class.Skoppydos;

public class Task2 {
    public static void main(String[] args) {
        byte q=5;
        byte d=4;
        byte n=3;
        byte p=2;
        double sum=(q*0.25)+(d*0.1)+(n*0.05)+(p*0.01);
        System.out.println("Total in dollars is $"+sum);

       double rounder =Math.round(sum*100)/100;
        System.out.println(rounder);
    }

}
