package test.java.java_class.Variables;

public class VariableFirst {

    public static void main (String[]args){
        //Java reads the code top to bottom and left to right
        int redApple=8;
        int yellowApple =20;
        int greenApple=3;

        int redApplePrice=3;
        int yellowApplePrice=2;
        int greenApplePrice=5;

        System.out.println(redApple*redApplePrice);
        System.out.println(yellowApple*yellowApplePrice);
        System.out.println(greenApple*greenApplePrice);

        int totalPrice=(redApple*redApplePrice)+(yellowApple*yellowApplePrice)+(greenApple*greenApplePrice);
        System.out.println("Total price is: "+totalPrice);

        System.out.println("RedApple number: " + redApple);
        System.out.println("Yellow Apple number: " + yellowApple);
        System.out.println("Green Apple number: " + greenApple);
    }
}
