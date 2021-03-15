package test.java.java_class.ForLoop;

public class InfiniteLoop {
    public static void main(String[] args) {
        /*for(;;){                                        //OCA question

            System.out.println("infinite");
        }*/
        for(int i=0; i<10; i++){

            System.out.println("test");
        }
        //System.out.println(i); //--> local variable only in the loop
    }
}
