package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class FirstPractice {
    public static void main(String[] args) {
        //when we create the array we must give the size of the array
        int [] ages= new int[5];
        //{0, 0, 0, 0, 0}
        System.out.println(ages[0]);
        System.out.println(ages[4]);
        //{18, 22, 45, 0, 33}
        ages[0] = 18;
        ages[1] = 22;
        ages[2] = 45;
        ages[4] = 33;
        ages[3] = 54;
        //ages[9] =99;  out of boundary exception because size of the array
        // is 5 we can't store the values to index num 9
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
       // System.out.println(ages[10]); //ArrayIndexOutOfBoundsException

        System.out.println(ages.length);
        System.out.println("Using loop print all the elements of the array");
        for(int i=0; i<ages.length;i++){
            System.out.print(ages[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ages));
    }
}
