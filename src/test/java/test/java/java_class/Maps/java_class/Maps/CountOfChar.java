package test.java.java_class.Maps;
import java.util.LinkedHashMap;

public class CountOfChar {
    public static LinkedHashMap<Character, Integer> getCount(String str){
        LinkedHashMap<Character, Integer> letters = new LinkedHashMap<>();
        //p -1, a-1
        for (int i = 0; i < str.length() ; i++) {
            char ch=str.charAt(i);
            if(letters.containsKey(ch)){
                int count = letters.get(i); //possible problem for interview
                letters.put(ch, ++count);
            }else {
                letters.put(ch, 1);
            }
        }
        return letters;
    }
    public static void main(String[] args) {
        //"Parameter" --> create a method will take the String as parameter
        // and it will return count of letters from map.
        //p-1
        //a-2
        //r-2
        //m-1
        // e-2
        //t-1
        System.out.println(getCount("parameter"));
    }
}
