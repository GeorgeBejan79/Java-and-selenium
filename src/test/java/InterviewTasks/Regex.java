package InterviewTasks;

public class Regex {
    public static void main(String[] args) {
        String given="234123498iojdfklsngmadfngmkg...x,";
        String replaced=given.replaceAll("[^A-Za-z]","");
        System.out.println(replaced);
        System.out.println(given);
        System.out.println(given.length());
        System.out.println(replaced.length());
    }
}
