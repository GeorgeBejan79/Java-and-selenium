package InterviewTasks;

public class SwapStrings {
    public static void main(String[] args) {
        String x="Hello";
        String y="Techtorial";

        x=x+y;
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
    }
}
