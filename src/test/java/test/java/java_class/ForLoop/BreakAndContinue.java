package test.java.java_class.ForLoop;
public class BreakAndContinue {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 0; i <= 10; i++){

            if(i == 10)  // if you want to break the loop at i=10
                break;
            k = k + 1; // will work only if the condition is false
        }
        System.out.println("k= "+k);
    }
}
// i=10; k=9; ==> break; Before reaching line 11