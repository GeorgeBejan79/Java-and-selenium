package InterviewTasks;

import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string");
        String str = input.nextLine();
        System.out.println(nonRepeatingChar(str));
    }

    public static String nonRepeatingChar(String str)
    {
        boolean bl = true;
        int i;
        for (i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    bl = false;
                    break;
                }
            }
            if (bl) {
                break;
            }
        }
        if (!bl)
        {
            return "";
        }
        else
            {
            return str.charAt(i) + "";
        }
    }
}
