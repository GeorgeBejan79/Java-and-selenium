package test.java.java_class.ForLoop;
public class PracticeTwo {
    public static void main(String[] args) {
        /*int n = 1;
        n *= 5;
        n /= 5;
        n += 5;
        n -= 5;*/
        for(int i=1; i<=5; i++){
            //System.out.println(i);
            for(int j=1; j<=5; j++){
                if(i==3) {   // break --completely stop executing the loop and exit from loop
                // continue-- stop where you are at and jump/go to the next iteration/
                break;
                }
            }

            if(i==4)
                break;
            System.out.println(i);
        }

    }
}
