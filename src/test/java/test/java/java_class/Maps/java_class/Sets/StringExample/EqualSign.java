package test.java.java_class.Sets.StringExample;

public class EqualSign {
    public static void main(String[] args) {
        String name1="David";
        String name2=new String("David");
        String name3="David";
        String name4=name2;
        name2=name1;//reasignment
        name1=name4;


        System.out.println(name4);// will not turn anything

            System.out.println(name2==name1);// false
            System.out.println(name3==name4); // false
            System.out.println(name1==name3); //false
            System.out.println(name1==name4); //true

        System.out.println(name2);
        System.out.println(name1);
        System.out.println(name3);
        System.out.println(name4);

        System.out.println(name2.length()==name3.length());
        //System.out.println(name2.length().equals(name3.length()); compile time error

    }
}
