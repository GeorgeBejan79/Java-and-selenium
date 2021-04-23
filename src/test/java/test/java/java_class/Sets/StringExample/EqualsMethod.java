package test.java.java_class.Sets.StringExample;

public class EqualsMethod {
    public static void main(String[] args) {

        String str ="Techtorial";
        String str1 ="Techtorial";
        String str2 =new String("Techtorial");
        String str3 =new String("Techtorial");
        String str4 ="Techtorial";
        String str5 ="Techtorial";

        // === will compare both variables are pointing to the same object in the memory or not
        // .equals--> will compare both object values are the same or not in string


        System.out.println(str==str1);// --> true
        System.out.println(str2==str3); //--> false
        System.out.println(str.equals(str1)); // true
        System.out.println(str2.equals(str3));// true

        System.out.println(str==str2); //false
        System.out.println(str.equals(str2)); //true

        String str6=str2;
        System.out.println(str6==str2); //true
        System.out.println(str6.equals(str2)); //true
    }
}
