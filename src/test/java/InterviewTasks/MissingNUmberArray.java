package InterviewTasks;

import java.util.Arrays;

public class MissingNUmberArray
{
    public static void main(String[] args)
    {
        int[] arr = {0, 4, 2, 3, 6, 8, 1, 9, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int num = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != num)
            {
                System.out.println(num);
                break;
            }
            num++;
        }

    }
}
