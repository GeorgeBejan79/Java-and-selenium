package test.java.java_class.ArraysPractice;
public class NumbersArray {
    public static void main(String[] args) {

        int [] numbers = {10, 20,30,25,45, 28,9,15};
        int count=0;
        for(int i=0; i < numbers.length; i++){

            if(numbers[i] > 20){
                count++;
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Count is " +count);
    }
}
