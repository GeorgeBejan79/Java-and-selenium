package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class SecondLargestNum {
    public static void main(String[] args) {
        int[] array = {100, 300, 200, 450,350};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
