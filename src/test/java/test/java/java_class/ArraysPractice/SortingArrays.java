package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class SortingArrays {
    public static void main(String[] args) {
        int [] numbers ={10, 6, 14, 8, 45, 34};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length ; j++) { //Interview question

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }System.out.println(Arrays.toString(numbers));
    }
}
