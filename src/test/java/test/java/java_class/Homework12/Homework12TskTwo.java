package test.java.java_class.Homework12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Homework12TskTwo {

    public static int [] getNumberFromString(String str){
        List<Integer> integers = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char ch0 = '0';
            char ch9 = '9';
            if (ch0 <= str.charAt(i) && str.charAt(i) <= ch9){
                char ch = str.charAt(i);
                String temp = ch +"";
                Integer integer = Integer.parseInt(temp);
                integers.add(integer);
            }
        }
        int [] array = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            array[i] = integers.get(i);
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array = getNumberFromString("Java1is2best3coding4language5");
        System.out.println(Arrays.toString(array));
    }


}
