package test.java.java_class.WhileLoop;

public class PrintStar {
    public static void main(String[] args) {
        String str ="*";
        int num = 1;

        while(num<=5){
            System.out.println(str); //  interview question
            str = str.concat("*");
            num++;
        }
    }
}
