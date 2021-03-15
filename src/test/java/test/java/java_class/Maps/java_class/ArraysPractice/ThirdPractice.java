package test.java.java_class.ArraysPractice;
public class ThirdPractice {
    public static void main(String[] args) {
        int [] numbers = {6, 45,367, 23,97};

        int biggest = numbers[0];//
        for(int i = 1; i < numbers.length ; i++){

            if(numbers[i] > biggest){
                biggest=numbers[i];
            }
        }
        System.out.println(biggest);
    }
}
