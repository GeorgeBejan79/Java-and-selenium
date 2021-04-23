package test.java.java_class.WrapperClass;
public class StringToWrapperClass {
    public static void main(String[] args) {


    String num="12.5";
    Double db=Double.valueOf(num); // converting a string in to a wrapper class
    System.out.println(db);
    double d= Double.valueOf("43.3");// bc of unboxing we can store wrapper class to primitive data types

    String num1="11";
    Integer n = Integer.parseInt(num1);//
        //bc of autoboxing we can store primitive ddata types to wrapper class object.
        Boolean bl= Boolean.parseBoolean("123");
        System.out.println(bl);

        Integer number =null;
        // int number2=null; --> compile time error
        int number1=number; //runtime error
        System.out.println(number1);
}
}