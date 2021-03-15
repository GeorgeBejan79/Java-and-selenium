package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class ArrayPracticeOne {
    public static void main(String[] args) {
        String reverse="";
        int[] arr={1,2,3,4,5,6,7};
        //-------------------------------------------------------------------------
        for ( int i = arr.length-1, k=0; k<arr.length/2;  i--, k++) {
            int temp = arr[k];
            arr[k] = arr[i];            // reverse the array
            reverse +=arr[i];
            arr[i]=temp;
        }
        //System.out.println(Arrays.toString(arr));
        //----------------------------------------------------------------------------
        /*for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];  //reverse it back
            arr[arr.length-1]=temp;
        }*/
        System.out.println(Arrays.toString(arr));
    }
}
