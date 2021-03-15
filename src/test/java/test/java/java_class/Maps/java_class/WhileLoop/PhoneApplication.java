package test.java.java_class.WhileLoop;
public class PhoneApplication {
    public static void main(String[] args) {
        // keep calling application-->
        // I have 50$ in my acc and every talk is 5$
        //talking
        int balance = 50;
        int count=1;
        while (balance > 0){
            System.out.println("talking "+count++);
            balance -= 5;

        }
        System.out.println(balance);
        System.out.println(count);
    }
}
