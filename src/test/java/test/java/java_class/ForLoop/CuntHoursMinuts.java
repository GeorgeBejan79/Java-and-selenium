package test.java.java_class.ForLoop;

public class CuntHoursMinuts {
    public static void main(String[] args) {

        for (int h = 1; h <= 12; h++) {
            System.out.println("hour "+h + " ");

            for (int m = 1; m <= 60; m++) {

                System.out.print(" " + m);
            }
            System.out.println("minutes");
            //System.out.println();
        }
    }
}