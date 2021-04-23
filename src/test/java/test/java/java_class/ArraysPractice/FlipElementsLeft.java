package test.java.java_class.ArraysPractice;
import java.util.Arrays;
import java.util.Scanner;
public class FlipElementsLeft {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your array size ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Please insert your elements in the array ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();    //user inputs numbers on each position
        }
        int temp=nums[0];
        for (int i = 0; i <3-1 ; i++) {
            nums[i]=nums[i+1];
        }
        nums[3-1]=temp;
        for (int i = 0; i < 3; i++) {
        }
        System.out.println(Arrays.toString(nums));
    }
}