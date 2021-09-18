package InterviewTasks;

import java.util.*;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        Integer[] arr={2, 5, 6, 3, 5, 6, 7};

        //ArrayList aList=  new ArrayList(Arrays.asList(arr));

        Set set =new HashSet(Arrays.asList(arr)); // removes duplicates

        Set<String> set1 = new TreeSet(Arrays.asList(arr));// arrange the numbers in asc order


        //System.out.println(aList);
        System.out.println(set+"no duplicates in Hashset");
        System.out.println(set1+" puts elements in ascending order and no duplicates");

//        int [] nums= { 0,0,1,1,1,2,2,3,3,4};
//        ArrayList aList=  new ArrayList(Arrays.asList(nums));
//        //Set set= new HashSet(java.util.Collections.singleton(nums));
//        HashSet set1=new HashSet(aList);
//
//        //System.out.println(Arrays.toString(aList));
//        System.out.println(set1);
    }

}
