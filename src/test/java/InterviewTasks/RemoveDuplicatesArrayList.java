package InterviewTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesArrayList
{
    public static void main(String[] args)
    {
        Integer[] arr = {2, 5, 10, 6, 3, 5, 6, 7};


        Set <Integer>set = new HashSet(Arrays.asList(arr)); // removes duplicates
//
       Set<Integer> set1 = new TreeSet(Arrays.asList(arr));// arrange the numbers in asc order
//
//
//        //System.out.println(aList);
       System.out.println(set + "no duplicates in Hashset");
       System.out.println(set1 + " TreeSet puts elements in ascending order and no duplicates");

    }
}
