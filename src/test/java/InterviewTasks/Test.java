package InterviewTasks;

public class Test {
    public static void main(String[] args) {

////
////        int[] arr = {0,  30, 45, 50, 51, 52, -4, -7,'!'};
////        for (int i = 0; i < arr.length ; i++) {
////            if(arr[i]<50 && arr[i]%2==0 ){
////                System.out.println(arr[i]+ " ");
////            }
////        }
//
//        String expected = "I evol avaJ";
//
//        String str = "I love Java";
//        // String reversed = new StringBuilder(str);
//
//        String[] newstr =str.split("");
//
//        for (int i = 0; i < str.length(); i++) {
//          //  newstr+=(new StringBuilder(str[i]).reverse().toString());

        String str = "I love Java";
        String reversed="";
        String [] arr= str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word="";
            for (int j = arr[i].length()-1; j >=0 ; j--) {
                word+=arr[i].charAt(j)+" ";

            }
            reversed=reversed+word+" ";
        }
        System.out.println(reversed);




    }
}