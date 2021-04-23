package test.java.java_class.Homework12;

public class Hw12TskThree {
    public static void main(String[] args) {
        String str = "Java1is2best3coding4language5";
        int sum = 0;
       int num = 0;
       int number=0;

        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                //System.out.print(str.charAt(i));
                str1 += str.charAt(i);

                num = Integer.parseInt(str1);
            }
        }
        for (int i = 1; i <=5 ; i++) {
            number = num%10;
            num = num/10;
            sum+=number;
        }
        System.out.println(sum);
    }
}