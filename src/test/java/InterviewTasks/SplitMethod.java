package InterviewTasks;

public class SplitMethod {
    public static void main(String[] args) {
        String techtorial="Techtorial interview preparation document";
        String [] words=techtorial.split(" ");
        System.out.println(words.length);

        for(String string: words){
            System.out.println(string);
        }
    }
}
