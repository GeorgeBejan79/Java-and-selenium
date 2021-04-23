package test.java.java_class.Primitives;

public class DataTypes {
    public static void main(String []args){

        byte num =-128;
        //if you try to store more than capacity of the byte value
        //it will give compile time error
        short num1=32_000;
        int num2=2_000_000_000;
        //for long values we need to give 'l' or 'L' at the end of the number
        long num3=345_345_345_345L;
        long num8=123454345466l;
        float num4=3.4f;
                float num5=4;
        System.out.println(num5);
        double num6=5.93;
        double num7=9;
        System.out.println(num6);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        char letter='A';
        char symbol='#';
        System.out.println(letter);

        int letterNum =letter;

        System.out.println(letterNum);
        char anyLetter='7';
        System.out.println(anyLetter);

        boolean isLightOn=true;
        boolean isMicOn=false;
        boolean isEqual =10==11;
        System.out.println(isEqual);
    }
}
