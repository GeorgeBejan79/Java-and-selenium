package InterviewTasks;

public class ReverseStringAndCountRepChar
{
   static  String reverse="";
   static char z = 0;
    public static void main(String[] args)
    {
        System.out.println( isFoundIn("puppies", 'p'));


    }
    public static String isFoundIn(String x, char z) {
        for (int i = x.length() - 1; i >= 0; i--) {
            reverse += x.charAt(i);
        if(x.contains("z"));
        z++;
        }
        return reverse ;

    }
    //public static int(char z)

}