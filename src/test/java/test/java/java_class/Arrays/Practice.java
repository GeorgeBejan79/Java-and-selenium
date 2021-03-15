package test.java.java_class.Arrays;

public class Practice {
    public static int main(String[] args) {
        //Scanner Scanner=new Scaneer(System);
            int[]nums={3,5,6,8,0,9};
        int biggest=0;
        for (int i = 0; i < nums.length; i++) {
            for(int  j=i+1; i<nums.length-1; j++){
                if(nums[i]<nums[j]){
                    biggest=nums[j];
                }
            }
        }


        return biggest;
    }
}
