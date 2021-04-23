package test.java.java_class.Homework;

public class HwkFiveTskTwo {
    public static void main(String[] args) {
        /*
        Please use method chaining for the following Strings. Methods are provided
    next to the String.
    String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
    String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’
    , concat with ’s’
    , starts
    with ‘C’
         */
        String str = " Sniker ";
        char ch = str.trim().toUpperCase().substring(1,4).charAt(2);
            System.out.println(ch);

            String str2 = "Cookie";
            str2 = str2.toLowerCase().replace('o','u').concat("s"); //.startsWith("C")+"";
                System.out.println(str2);
                str2 = str2.startsWith("C")+"";
        System.out.println(str2);

    }
}
