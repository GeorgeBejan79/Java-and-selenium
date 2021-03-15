package test.java.java_class.Sets.StringExample;

public class NullPointerException {
    public static void main(String[] args) {
        String test =null;
        System.out.println(test.length()); //null exception
        String test1;
        //System.out.println(test1.length()); compile time error
    }
}
