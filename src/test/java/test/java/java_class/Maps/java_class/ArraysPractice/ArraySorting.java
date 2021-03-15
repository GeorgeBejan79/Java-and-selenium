package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {

        long[] numbers={10, 5, 11, 3, 45, 34};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers); // sorts numbers in array
            System.out.println(Arrays.toString(numbers));

        String [] names= {"Olivia", "David", "Dan", "Priyanka", "Gopal"};
        Arrays.sort(names); // sorts names alfabeticaly
            System.out.println(Arrays.toString(names));
        String [] nums= {"100", "10", "11", "10100"};
        Arrays.sort(nums);// 10 100 10100 11
            System.out.println(Arrays.toString(nums));
    }
}
