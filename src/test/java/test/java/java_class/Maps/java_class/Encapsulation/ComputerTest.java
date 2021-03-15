package test.java.java_class.Encapsulation;
public class ComputerTest {
    public static void printEven(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]%2==0){
                if (nums[i] == nums[nums.length-1]) {
                    System.out.print(nums[i]);
                }else{
                    System.out.print(nums[i]+",");
                }
            }
        }
    }
    public static void printEven2(int [] nums){
        String str="";
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0) {
                str+=nums[i]+",";
            }
        }
        System.out.println(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        Computer computer= new Computer("Apple","intel",999);
        System.out.println(computer.getBrand());
        System.out.println(computer.getCPU());
        System.out.println(computer.getPrice());
        //computer.setPrice(); since we didn't create setters in computer class
        //it is call immutable class

        int[] numbers={1,2,3,4,5,6,7,8,10};
        printEven(numbers);
        System.out.println();
        printEven2(numbers);
        //print the numbers in following format
        // print 2,4,6
    }
}
