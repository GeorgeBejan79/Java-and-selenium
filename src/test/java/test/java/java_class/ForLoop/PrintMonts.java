package test.java.java_class.ForLoop;

public class PrintMonts {
    public static void main(String[] args) {
        // task
        //starting from 2015 to 2020 included, print years and then months


        for( int y=2015; y<=2020; y++){
                System.out.print(y+" ");

            for(int m=1; m<=12; m++){

                System.out.print(" "+m);
            }
            System.out.println();
        }
    }
}
