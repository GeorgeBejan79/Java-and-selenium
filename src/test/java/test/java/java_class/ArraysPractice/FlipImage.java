package test.java.java_class.ArraysPractice;
import java.util.Arrays;
public class FlipImage {

    public static void main(String[] args) {
        int[][] image ={{1,1,0,0},{0,1,0,1},{1,1,1,1},{0,0,1,1}};

        System.out.println(image[0][image[0].length-1]);
        System.out.println(image[1][image[1].length-1]);
        System.out.println(image[2][image[2].length-1]);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                int temp = image[i][j];      // temp
                image[i][j]=image[i][image[i].length-j-1];
                image[i][image[i].length-j-1]=temp;
            }
            System.out.println(Arrays.toString(image[i]));

        }

        //System.out.println(Arrays.toString(image));
    }
}
