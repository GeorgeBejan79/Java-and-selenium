package test.java.java_class.IfStatements;

public class CurlyBraces {
    public static void main(String[] args) {

        int x = 5;
        int r = 4;
        if(r >=x)
            x++;
        --x;
        x--;

        System.out.println(x);
        int num;
        if(10<5){
            num=6;
        }
        //System.out.println(num); compile time error
    }
}
