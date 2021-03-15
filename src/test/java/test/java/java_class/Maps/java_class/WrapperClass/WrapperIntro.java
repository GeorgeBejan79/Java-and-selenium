package test.java.java_class.WrapperClass;

public class WrapperIntro {
    public static void main(String[] args) {
        byte by=10;
        Byte b= new Byte(by);
        System.out.println(b==10);
        Character ch=new Character('c');
        System.out.println(ch);
        System.out.println(Character.isDigit('1'));  // static method
        System.out.println(ch.compareTo('d')); //if both char are equals to each other
        // compareTo()method will return 0 otherwise it will return -result
        char c1='c';

        Boolean bl=new Boolean("true");
        System.out.println(bl);

        Integer number = new Integer(11); // 1 way to create
        Integer num = 55;// 2nd way to create

        Long ln = 100l;
        Short sh = 55;
        Float fl = 44f;
        Double db = 56d;
        Double db1 = (double)56;
        Integer num1 = new Integer(55);
        System.out.println(num==num1);//false since the references are not pointing to the same object
        System.out.println(num.equals((num1))); // turn true since num and num1 has the same value.
        //if equals method is coming from the object class it will compare the references ar
        // pointing to the same object or not
        //if the equals method is coming from wrapper
        // class it will compare the values of the object
    }
}
