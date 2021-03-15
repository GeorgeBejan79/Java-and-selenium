package test.java.java_class.Homework12;

public class Homework12TskOne {
    public static void main(String[] args) {
        String str = "Java1is2best3coding4language5";
    }
    public String getStr (String str) {

        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                str1 += str.charAt(i)+"";
                System.out.println(str.charAt(i));
            }
        }
return str1;
    }
}
