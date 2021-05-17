package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList aList=  new ArrayList<String>(Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James"));
            HashSet set =new HashSet(aList);
    }
}
