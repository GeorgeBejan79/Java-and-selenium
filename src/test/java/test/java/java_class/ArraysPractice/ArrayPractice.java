package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        String str="Split method is coming from the sString class." +
                " Split methods is talking one parameter as regex(Regular expression) value." +
                "This method will split the value of the string and store them\n" +
                "inside the array.";
        //Task: Print all the words which has the length of odd numbers.
        String[] words = str.split(" ");
            System.out.println(Arrays.toString(words));
        for (int i = 0; i <words.length ; i++) {

            if(words[i].length()%2!=0){
                System.out.print(words[i]+" ");
            }
        }
    }
}
