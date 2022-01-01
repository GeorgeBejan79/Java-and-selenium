package test.java.java_class.Mentoring;

import java.util.*;

public class ArrayArrayList
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        int startNumber = 2;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = startNumber++;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        //2,3,4,5......
        List<Integer> myList = new ArrayList<>();
        int startNumber2 = 3;
        for (int i = 0; i < 10; i++) {
            myList.add(startNumber2++);
            myList.get(i);
            System.out.print(myList.get(i) + " ");
        }
        myList.add(26);
        System.out.println();
        System.out.println(myList);
    }
}
