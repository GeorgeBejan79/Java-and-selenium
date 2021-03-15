package test.java.java_class.DoWhileLoop;

public class FirstExample {
    public static void main(String[] args) {

        // want to print "Chicago" text five times
        int count=6;

        do{
            System.out.println("Chicago");
            count++;
        }while(count<=5);
        System.out.println(count);

        int num=6;
        while(num<=5){
            System.out.println("Des Planes");
            num++;
        }
        System.out.println(num);// num will be 6 bc while condition is false
    }
}
