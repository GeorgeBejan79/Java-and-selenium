package test.java.java_class.Mentoring;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {

        int [] arr={2,3,-3,5,6,9,0};  // sort the elements in arrays and find the smallest
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[minIndex]=temp;
            System.out.print(arr[i]+",");

        }
    }
}
