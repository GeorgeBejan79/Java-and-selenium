package InterviewTasks;

public class REverseStringWordbyWord {
    public static void main(String[] args) {
//        String str = "I love Java";
//        String reverse = "";
//        String[] arr = str.split(" ");
//        for (int i = arr.length-1; i >= 0; i--) {
//
//            reverse = reverse + arr[i] + " ";
//        }
//        System.out.println(reverse);
    
    String str ="I love Java";
    String reversed="";
    String [] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word="";
            for (int j = arr[i].length()-1; j >=0 ; j--) {
                word+=arr[i].charAt(j)+" ";
            }
            reversed=reversed+word+" ";

        }
        System.out.println(reversed);
}}