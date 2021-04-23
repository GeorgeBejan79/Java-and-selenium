package test.java.java_class.ArraysPractice;
import java.util.Arrays;
import java.util.Scanner;
public class SecondPractice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
            System.out.println("Please insert size of the array");
        int num= input.nextInt();
        String [] names = new String[num];
        int index = 0;

        for(int i = 1; i < num; i++){
            System.out.println("Please enter name:");

            String name = input.next();
            if(name.length() > 5){
                names[index++] = name; //storing names in the array
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
