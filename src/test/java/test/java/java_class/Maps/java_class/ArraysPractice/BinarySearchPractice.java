package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class BinarySearchPractice {
    public static void main(String[] args) {
    /* we must sort the array before using the binary search method Array.binarySearch(nameOfTheArray, number);
    * If number is available the binary search will return index of the element
    * If number is not available the binary search will return expected location of the element with counting and result will be negative */
    int [] numbers ={4, 5,5,5,5, 6787, 3,6,856};
        System.out.println(Arrays.toString(numbers));
    int result=Arrays.binarySearch(numbers,5);
        System.out.println(result);
        }
}
