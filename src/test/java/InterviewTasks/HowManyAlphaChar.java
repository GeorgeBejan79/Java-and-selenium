package InterviewTasks;

public class HowManyAlphaChar {
    public static void main(String[] args) {
        String original="asdgioeorj<:{}gncvnm48923465<>";
        String replaced=original.replaceAll("[^A-Za-z]","");
        System.out.println(replaced.length());
        System.out.println(replaced);
    }
}




























