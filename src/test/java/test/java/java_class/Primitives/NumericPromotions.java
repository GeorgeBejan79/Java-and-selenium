package test.java.java_class.Primitives;

public class NumericPromotions {
    public static void main(String[] args) {
        //long>int>short>byte
        //double>float
        byte count1=50;
        int count2=10;
        int num = count1+count2;

        //short num=count1+count2; compile time error
        System.out.println( num);
        float price1=10.99f;
        short price2=700;
        float fl=price1+price2;
        byte price3 =89;
        double price4=435.9870;
        double db =price3*price4;
        int sh = price2+price3;// result is promoted to int
         byte b=10;
         short s=19;
         double d =5.4;
         double f=b+s*d;


    }
}
