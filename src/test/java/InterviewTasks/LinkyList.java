package InterviewTasks;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkyList {
    public static void main(String[] args) {
        LinkedList <Integer>linky=new LinkedList<Integer>();
        linky.add(6);
        linky.add(78);
        linky.add(1);

            //linky.clear();
        System.out.println(linky.getFirst());
        Iterator it= linky.iterator();
        while(it.hasNext()){
            if((int)it.next()==78){
                System.out.println("we found 78");
            }
        }

    }

}
