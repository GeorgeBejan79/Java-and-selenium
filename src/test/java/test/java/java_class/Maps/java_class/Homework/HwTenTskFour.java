package test.java.java_class.Homework;
import java.util.Arrays;
public class HwTenTskFour {
    public static void main(String[] args) {
        /*Write the application to find the second largest value from given
        array.
        Example:
        Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
        Output: 8*/
        int [] nums={3,2,8,9,5,1,3,4,7,8,5,9,9};
        Arrays.sort(nums); // 1,2,3,3,4,5,5,7,8,8,9,9,9
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i-1]<nums[i]){
                System.out.println(nums[i-1]);
                break;
            }
        }
    }
}


