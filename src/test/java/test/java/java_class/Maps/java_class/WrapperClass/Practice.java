package test.java.java_class.WrapperClass;

public class Practice {
    public static void main(String[] args) {

        Long num1 = 10l;
        Long num2 = new Long(10l);
        Long num3 = 10l;
        System.out.println(num1 == num2);  // compares location of storage one is in stack one in hipp return false
        System.out.println(num1.equals(num2));

        System.out.println(num1==num3); // true
        System.out.println(num1.equals(num3));
    }
}
