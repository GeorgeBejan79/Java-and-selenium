package test.java.java_class.StringBuilderPr;
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new  StringBuilder();
        String reversed =getReversedString("Madam");
        System.out.println(reversed);
    }
    public static void printStringBuilderInfo(StringBuilder sb) {
        System.out.println("The capacity is "+ sb.capacity());
        System.out.println("The length is "+sb.length());

        }

    public static String getReversedString(String s){
        String reversed="";
        for (int i = 0; i < s.length(); i++) {
            reversed=reversed+ s.charAt(i);

    }return reversed;
    }
    private static String getReversedString2(String s){
        StringBuilder sb =new StringBuilder(s);
                return sb.reverse().toString();
    }
}
