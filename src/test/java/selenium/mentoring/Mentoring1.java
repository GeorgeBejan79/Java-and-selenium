package selenium.mentoring;

import java.util.Scanner;

public class Mentoring1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //int result=a;
            int result2 = a;
            for (int j = 0; j < n; j++) {
                int powerOfTwo = (int) Math.pow(2, j);

                int addToresult = b * powerOfTwo;
                result2 += addToresult;
                System.out.print(result2);
                System.out.print(" ");

            }
            System.out.println();
        }
        in.close();
    }
}
