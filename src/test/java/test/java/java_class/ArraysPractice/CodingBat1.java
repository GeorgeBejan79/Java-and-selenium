package test.java.java_class.ArraysPractice;

import java.util.Scanner;
public class CodingBat1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your array size ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Please insert your elements in the array ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();    //user inputs numbers on each position
        }
        boolean double23=false;

        if(size==0){
            double23=false;
        }
        if(size==1){
            double23=false;
        }
        if(size==2){


            if(nums[0]==nums[1]){
                double23=true;}
            else{
                double23=false;
            }
        }
        System.out.println(double23);

        //System.out.println(Arrays.toString(nums));
    }
}