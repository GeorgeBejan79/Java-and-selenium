package InterviewTasks;

public class ReverseAStringWordByWord {
    public static void main(String[] args) {
        /*String word="hello techtorial";
        StringBuffer sb =new StringBuffer(word);
        System.out.println(sb.reverse());*/

        String word = "I love Java";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }


}
