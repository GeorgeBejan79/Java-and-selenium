package test.java.java_class.strings;

public class ReverseStringSB {
    public static void main(String[] args) {

         //solution 1 using string builder
        StringBuilder sb = new StringBuilder("Programming");
        System.out.println("string = "+sb);
        // reversing of stringbuilder
        System.out.println("reverse = "+sb.reverse());

        //solution 2
        /* String str="I love Java";
        String reverse="";
        for (int i = str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);*/

    }
}

