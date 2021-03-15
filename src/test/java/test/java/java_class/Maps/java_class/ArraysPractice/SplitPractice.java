package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class SplitPractice {
    public static void main(String[] args) {
        String str="Split method is coming from the String Class";
            System.out.println(str.length());
        // return type of the split method is String array(interview question)
        String[] words = str.split(" ");
        //Note split method will split the string with spaces and store inside the array
                System.out.println(Arrays.toString(words));
                System.out.println(words.length);
            String cities="Chicago.Denver.Austin.Houston.Portland";
            String [] city =cities.split("\\.");
            //Note when we try to split with. we must use double slash in the beginning.
        System.out.println(Arrays.toString(city));
        String name="\"Techtorial\"\t\nAcademy";
        System.out.println(name);

    }
}
