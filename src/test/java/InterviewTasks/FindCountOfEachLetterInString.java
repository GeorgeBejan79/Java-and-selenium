package InterviewTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCountOfEachLetterInString {
    public static void main(String[] args) {

//*************Calculates ocurences of each character****************************
//        String str = "Merry Christmas Bejan Family";
//        Map<Character, Integer> result = new LinkedHashMap<>();
//        for (int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if (result.containsKey(ch))
//            {
//                int count = result.get(ch);
//                result.replace(ch, ++count);
//            } else
//                {
//                result.put(ch, 1);
//            }
//        }
//        System.out.println(result);
      //****************Calculates how many times each number occurs******************
        int[] nums ={3, 7, 8, 55, 45, 9, 3, 7, 4};
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < nums.length-1 ; i++) {
            int num = nums[i];
            if (result.containsKey(num))
            {
                int count = result.get(num);
                result.replace(num, ++count);

            }
            else
                {
                    result.put(num,1);
                }
        }
        System.out.println(result);
   }
}
