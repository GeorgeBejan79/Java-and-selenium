package test.java.java_class.Sets.StringExample;

public class MethodChaining {
    public static void main(String[] args) {

        String month=" January ";

        month = month.trim().toLowerCase().substring(0,3).replace("n","N");


            System.out.println(month);// "jaN" --

        String month2 ="February ";

        //month2 = month2.trim().concat(" Method Chaining").indexOf("b"); compile time error
        //Note: we cannot do method chaining after indexOF() method
        //int index = month2.indexOf("b").trim().concat(" Method Chaining");

        int index = month2.trim().concat(" Method Chaining").indexOf("b");

        boolean bl = month2.trim().equals("February");
        System.out.println(bl);
        // NOTE change zero to one, make all of them upper case, remove spaces, get only first three char
        //print length of first three char
        String str ="Zero to Hero";

            int number =str.replace("Zero","One").toUpperCase().trim().substring(0, 3).length();

        System.out.println(number);

        char num= str.substring(0,5).charAt(3);
        System.out.println(num);

    }
}
