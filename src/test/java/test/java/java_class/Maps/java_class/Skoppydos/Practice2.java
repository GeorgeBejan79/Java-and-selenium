package test.java.java_class.Skoppydos;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("please enter min num:" );
        int min=input.nextInt();
            System.out.println("please enter max num:" );
        int max=input.nextInt();
        int sum=0;
        String result="";

        for( int i=1; min<= max; min++){
            //System.out.println(min);
            if(min%7==0 && min%2==0 && min!=0){

                result+=min+"+";
                 sum+=min;
            }
        }
        System.out.println(result.substring(0,result.length()-1)+"="+sum);
    }
}

