package test.java.java_class.ArraysPractice;

public class FifthPractice {
    public static void main(String[] args) {
        //boolean isDifferent=false;
        int[] arr={4, 2, 2, 7,7, 8, 1, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            int count=1;

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i]==arr[j]); {
                    count++;
                    if(arr[i]==arr[i+1]){

                        i++;
                    }

                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
