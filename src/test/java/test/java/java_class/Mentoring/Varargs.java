package test.java.java_class.Mentoring;

public class Varargs {
    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }

    public static int sum(int... nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,6,7,10};
        System.out.println(sum(4,45));
        System.out.println(sum(nums));
        System.out.println(sum(1,6,7,6,5));

        System.out.println("==========");

        System.out.println(sub(45,4));
        System.out.println(sub(25,nums));
        System.out.println(sub(40,1,6,7,6,5));
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int sub(int num1, int... nums) {

        for(int i=0; i<nums.length; i++) {
            num1 -= nums[i];
        }
        return num1;
    }
}





