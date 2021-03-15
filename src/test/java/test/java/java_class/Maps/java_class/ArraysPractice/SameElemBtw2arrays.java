package test.java.java_class.ArraysPractice;
public class SameElemBtw2arrays {
    public static void main(String[] args) {
        int[] list1 = {1, 1, 1, 1, 2, 2, 3, 4, 5, 8, 12};
        int[] list2 = {1, 1, 3, 3, 3, 3, 6, 6, 7, 7, 8, 9, 10, 11};

        numSame(list1, list2);
    }
    public static void numSame (int[] list1, int[] list2) {
        int same = 0;
        for (int i = 0; i <= list1.length-1; i++) {
            for(int j = 0; j <= list2.length-1; j++) {
                if (list1[i] == list2[j]) {
                    same++;;
                    list2[j] = list2[0]-1 ;
                    break;
                }
            }
        }
        System.out.println("Number of the elements that are the same btw two arrays is "+same);
    }
}
