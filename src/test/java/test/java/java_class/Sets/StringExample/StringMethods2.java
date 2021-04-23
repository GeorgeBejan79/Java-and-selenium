package test.java.java_class.Sets.StringExample;

public class StringMethods2 {
    public static void main(String[] args) {
        String device ="mic rophone";
        System.out.println(device.charAt(4));

        char letter = device.charAt(8);// return type of charAt() method is char

        System.out.println(letter);

        System.out.println(device.charAt(5));// throws the exeption since index number is bigger
        System.out.println(device.indexOf("m"));
        System.out.println(device.indexOf(" "));
        System.out.println(device.indexOf("rop")); //it will return index number for the first matching element
        System.out.println(device.indexOf("k"));// if there is no matching letter it will return -1
        System.out.println(device.indexOf("ono"));// -1 --> it should matching exactly all the letters
        System.out.println(device.indexOf("o")); // index of first matching 'o'
        System.out.println(device.indexOf("on"));
        System.out.println(device.indexOf("o",6)); //it started to looking fo 'o' from index of 6
        System.out.println(device.indexOf("o",device.indexOf("o")+1));
    }
}
