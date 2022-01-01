package test.java.java_class.Sets.StringExample;

public class StringMethods
{

    public static void main(String[] args)
    {
        String name = "Kushal";
        System.out.println(name);
        name = name.concat(" Puri");
        System.out.println(name);
        name += " Puri";

        System.out.println(name);
        System.out.println(name.length());
        int countLetter = name.length();
        System.out.println(countLetter);
    }
}
