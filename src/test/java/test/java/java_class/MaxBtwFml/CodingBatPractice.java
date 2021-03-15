package test.java.java_class.MaxBtwFml;
import java.util.Scanner;
class MaxBtwFmL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("please enter your array size ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Please insert your elements in the array ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();    //user inputs numbers on each position
        }

        int maxBtwfml=0;
        int first=nums[0];
        int middle= nums[nums.length/2];
        int last= nums[nums.length-1];
        maxBtwfml= Math.max(Math.max(first, middle), last);
        System.out.println(maxBtwfml);

        }
    }












