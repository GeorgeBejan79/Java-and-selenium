package test.java.java_class.ForLoop;
public class NestedLoopTwo {
    public static void main(String[] args) {
        int n = 4;
        int counter = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j > i)
                    System.out.print(" ");
                else {
                    counter++;
                    System.out.print(counter+" ");
                }
            }
            System.out.print("\n");
        }
    }
}