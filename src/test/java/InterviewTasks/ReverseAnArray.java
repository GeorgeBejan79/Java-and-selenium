package InterviewTasks;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int nums[] = {45, 62, 7, 67, 23, 35, 11};
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i]; // 45
            nums[i] = nums[nums.length - i - 1]; //
            nums[nums.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}


