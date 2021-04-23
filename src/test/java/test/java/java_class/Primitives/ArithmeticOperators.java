package test.java.java_class.Primitives;

public class ArithmeticOperators {
    public static void main(String[]args){
        int a= 5;
        int  b=a+3; // b=8
        int  c=b+5;  // 13

        System.out.println(5);

        int num=a*b;

        System.out.println(num);

        int carNum=c-b;
        System.out.println(carNum);

        int division =carNum/2;
        System.out.println(division);

        double result = carNum/2.0;
        //to get the result as double one side of division should be decimal number

        System.out.println(result);
        // Reminder (Module)%--> It will give the remain value after you divide number.
        // 65 10+10+10+10+10+10+5
        // 65%10=5 75%20=15   20+20+20+15  8%10=8
        //if the left side is less then right side reminder will be left side.
        int num1=124312351%10;// 6
        System.out .println(num1);
    }
}
