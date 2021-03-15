package test.java.java_class.Primitives;

public class Casting {
    public static void main(String[] args) {

        int num = 100;
        byte num1 = (byte)num;
            System.out.println(num1);

            short sh = 50;
            byte by = 66;
            by=(byte)(sh + by);
                System.out.println(by);

            float fl=89.87f;
            double db = 12.34;
            fl=(float)(fl+db);// in the begging of the assignment we are providing the data type
                                /// witch we are trying to cast
            int number = 123;
            long ln = 54;
                            //number=(int)(number+ln);
            number+=ln;     //number=number+ln;

        System.out.println(number);

    }
}
