package InterviewTasks;

public class ReverseAStringWordByWord {
    public static void main(String[] args)
    {

//**********************for loop***************************
        String word = "I love Java";
//       String reverse = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverse += word.charAt(i);
//        }
//        System.out.println(reverse);

//**********String Builder**************************************
//        StringBuilder sb =new StringBuilder(word);
//        System.out.println(sb.reverse());

//****************String Buffer********************************
//        StringBuffer sb = new StringBuffer(word);
//        System.out.println(sb.reverse());
        //*********Char Array***************************************
        String reversed = "";
        String[] array = word.split("");
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + array[i] + " ";
        }
        System.out.println(reversed);
    }
}
