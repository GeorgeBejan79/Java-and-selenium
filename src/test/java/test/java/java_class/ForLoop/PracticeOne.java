package test.java.java_class.ForLoop;
public class PracticeOne {
    public static void main(String[] args) {
        int line = 5;
        int row = 5;
        int count = 25;

        for (int i = 1; i <= line; i++){
                System.out.println();

            for(int j = 1; j <= row; j++){
                    System.out.print(count+" ");
                count--;
            }
        }
    }
}