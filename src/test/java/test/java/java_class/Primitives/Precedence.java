package test.java.java_class.Primitives;

public class Precedence {
    public static void main(String[] args) {
        /*
        30+1-16=15
         */
        int count=10*3+4%3-8*2;

        /*
        1 *,/ and % will be executed first
        2 if you have the same level of precedence will be executed from left to the right
        3 put parentheses to be able to change the precedence
        * */
        System.out.println(count);
        int count1=10*(3+4)%((3-8)*2);
        //70%-10

        System.out.println(count1);
    }
}
