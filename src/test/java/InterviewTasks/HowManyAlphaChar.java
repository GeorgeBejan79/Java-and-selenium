package InterviewTasks;

public class HowManyAlphaChar {
    public static void main(String[] args) {
        String original = "asdgioeorj<:{}gncvnm48923465<>";
        String replaced = original.replaceAll("[^A-Za-z]", "");
        System.out.println(replaced.length()+" alpfha characters in this string");
        System.out.println(replaced);

        String newer=original.replaceAll("[^0-9]","");
        System.out.println(newer.length());
        System.out.println(newer);


        int number = Integer.parseInt(newer);
       int sum=0;
       while(number>0)
       {
           sum=sum+number%10;
           number=number/10;
       }
        System.out.println(sum);
    }
}




























