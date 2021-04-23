package test.java.java_class.ForLoop;

public class PrintLetters {
    public static void main(String[] args) {

        String str = "For loop practice class";
        // print all the numbers from this string using for loop
        // print all the letters from this string using for loop
        // 3 print only the char witch is 'o'
            int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.println(str.charAt(i));
                //System.out.println(str.charAt(ch));
            }
            //System.out.println("test" );
            count++;
        }
        System.out.println(count);
    }
}
