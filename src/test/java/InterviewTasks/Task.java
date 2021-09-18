package InterviewTasks;

import java.util.ArrayList;
import java.util.List;

public class Task
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        List<Integer> list1 = new ArrayList();
        list1.add(2);
        list1.add(4);
        System.out.println(oneContainsTwo(arr1, list1));
    }

    public static boolean oneContainsTwo(ArrayList arr1, List list1) {
        if (arr1.containsAll(list1)) {
            return true;
        } else {
            return false;
        }
    }
}

