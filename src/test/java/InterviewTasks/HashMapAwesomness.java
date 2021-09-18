package InterviewTasks;

import java.util.HashMap;

public class HashMapAwesomness
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;
        int c = 88;

//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a", 10);
//        happy.put("b", 3);
//        happy.put("c", 88);
//        System.out.println(happy);// prints values and keys added
//        System.out.println(happy.get("c"+"prints value of c"));
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobyJoe96", "fluflyPonies");
        fun.put("HelloKitty", "aloeverra");
        fun.put("coolgusguy", "password123");
        fun.remove("HelloKitty"); //removes hellow
        //System.out.println(fun.containsValue("password123")); // checks if value psw123...is there
        System.out.println(fun.containsKey("coolgusguy"));
        System.out.println(fun.size());
        System.out.println(fun.replace("bobyJoe96", "be34tterps3w"));
        //System.out.println(fun);
        System.out.println(fun.values());
        System.out.println(fun.keySet());
    }
}