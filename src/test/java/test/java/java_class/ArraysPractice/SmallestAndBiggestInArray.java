package test.java.java_class.ArraysPractice;

public class SmallestAndBiggestInArray {
    public static void main(String[] args) {
        int biggest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int[] nums={10,20,80,25,45,28,9,15};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>biggest){
                biggest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println(smallest);
        System.out.println(biggest);
        //Arrays.toString(nums);
    }
}
