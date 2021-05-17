package InterviewTasks;

import java.util.Arrays;

public class SecondLArgestNrInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 89, 5, 36, 67};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
//        int[] arr = {3, 5, 89, 5, 36, 67};
//        int largest=arr[0];
//        int secondLargest=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>largest){
//                secondLargest=largest;
//                largest=arr[i];
//            }else if(arr[i]>secondLargest&&arr[i]!=largest){
//                secondLargest=arr[i];
//            }
//        }
//        System.out.println("the largest number is "+largest+" second largest number is "+secondLargest);

    }
}
