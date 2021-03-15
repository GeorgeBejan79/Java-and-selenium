package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class MissingNumber2 {
    public static void main(String[] args) {

        int[] numbers={7,6,5,3,1};
        // from given array print all missing numbers btw 1-9
        Arrays.sort(numbers);
        for (int i = 1; i <= 9 ; i++) {
            boolean missing = true;

            for (int k= 0; k < numbers.length; k++) {

                if(i == numbers[k]){
                    missing=false;
                }
            }
            if(missing==true){

                System.out.println(i);
            }
        }
    }
}
