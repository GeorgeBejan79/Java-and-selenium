package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[5];
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //int j=i+1;

                temp = arr[i];
                arr[i] = newArr[j];
                newArr[j] = temp;
                //System.out.print(newArr[j] + " ");
            }
            //System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(newArr));;
    }

}