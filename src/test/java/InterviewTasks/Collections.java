package InterviewTasks;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();
        for (String x : things)
            list1.add(x);

        System.out.println(list1);

        String[] morethings = {"lasers", "hats"};
        List<String> list2= new ArrayList<String>();
        //String[] list2 = {"eggs", "lasers", "hats", "pie"};

        for(String y: morethings)
            list2.add(y);
        for (int i = 0; i < list2.size(); i++) {
            System.out.printf("%s ", list1.get(i)); // prints elements from the list two
        }
    }
}