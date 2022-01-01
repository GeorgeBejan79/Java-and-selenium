package test.java.java_class.ArraysPractice;

import java.util.Scanner;

public class CodingBat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {10, 2, 3};
        int temp = nums[0];
        for (int i = 0; i < 3 - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[3 - 1] = temp;
        //System.out.println("\nNew array after rotating by one position in the left direction");
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}



