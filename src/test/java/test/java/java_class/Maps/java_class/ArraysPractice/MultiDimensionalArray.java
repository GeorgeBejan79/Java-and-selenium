package test.java.java_class.ArraysPractice;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //[[3.7, 2.9, 5.4,4.8],[0, 0 , 0 ,0],[0,0,0,0] ]
        double[][] prices =new double[3][4];

            prices[0][0]=3.7;
            prices[0][1]=2.9;
            prices[0][2]=5.4;
            prices[0][3]=4.8;
            prices[2][1]=20;
            prices[1][3]=11;
            prices[2][3]=18.9;

        for (int i = 0; i < prices.length ; i++) { // prices length for how many arrays inside main array

            for (int j = 0; j <prices[i].length ; j++) {//prices[i]-length of each array

                System.out.print(prices[i][j]+" ");

            }

        }
        //System.out.println(Arrays.toString(prices));
    }
}
