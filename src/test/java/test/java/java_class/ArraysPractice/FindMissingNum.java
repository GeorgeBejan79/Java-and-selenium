package test.java.java_class.ArraysPractice;
public class FindMissingNum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,8,9}; // 45
        //int sum=0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
//        int sum=0;
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            sum+=arr[i];
//
//        }
//
//        int expectedSum=9*10/2;
//        System.out.println(expectedSum-sum);
        // 1,2,3,4,..... 19== N*(N+1)/2



