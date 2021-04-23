package test.java.java_class.StringBuilderPr;

public class Task2 {
    public static void main(String[] args) {

        StringBuilder numbers= new StringBuilder("FG56JF8AE8WRTUJ56758SDFK9SF5");
        //create one method that will return sum of digits from StringBulder object.
//1-if(ch>=48 && ch<=57)
        //2-if
        System.out.println(sum(numbers));
    }
    public static int sum(StringBuilder str){

        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(Character.isDigit(ch)){
                String c=String.valueOf(ch);
                int num=Integer.parseInt(c);
                sum+=num;
            }

        }
        return sum;
    }
}
