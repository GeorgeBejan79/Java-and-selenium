package test.java.java_class.ForLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            System.out.print(i+" ");
            for(char ch='b'; ch<='d'; ch++){


                System.out.println(ch);
            }
        }
    }
}