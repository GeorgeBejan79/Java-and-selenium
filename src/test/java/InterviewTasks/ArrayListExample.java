package InterviewTasks;
import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        String [] fruits = new String[3]; //exact size
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="Strawberry";
        System.out.println(fruits[1]);

        ArrayList fruitList= new ArrayList(); //dinamic
        fruitList.add("mango");
        fruitList.add("apple");
        fruitList.add("strawbery");
        fruitList.add("watermelon");
        //fruiList.remove("strawbery");
        //fruiList.clear();
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);
    }
}
