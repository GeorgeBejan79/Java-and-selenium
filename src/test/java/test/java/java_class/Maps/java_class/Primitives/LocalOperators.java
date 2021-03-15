package test.java.java_class.Primitives;

public class LocalOperators {
    public static void main(String[] args) {

        int number = 8;
        boolean result = ++number - --number >= 1 && number-- < 10;
        //9-8>1 (true) && 8 (true
        System.out.println(number); //7
        System.out.println(result); //true

        long pages =123;

        boolean $result=pages-- + pages >130 || pages++ + ++pages!=123;
        //result =245 < 130 (false) |ue

        //pages =122
            System.out.println(pages);//122
            System.out.println($result); //true
    }

}
