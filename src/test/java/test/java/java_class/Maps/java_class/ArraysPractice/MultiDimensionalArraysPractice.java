package test.java.java_class.ArraysPractice;

public class MultiDimensionalArraysPractice {
    public static void main(String[] args) {

        String[][]  product = new String[3][3];

        product [0][0]="Apple";
        product [0][1]="Microsoft";
        product [0][2]="Google";

        product[1][0]="Apple";
        product[1][1]="Samsung";
        product[1][2]="Huawei";

        product[2][0]="Bose";
        product[2][1]="LG";
        product[2][2]="Beats";

        double [][] prices = {{1250.0, 850.9, 590.99},{1000.99, 899.9, 650},{359.0, 299.00, 499.99}};

        for (int i = 0; i < product.length ; i++) {
            String result ="";
            for (int j = 0; j < product[i].length; j++) {
                result+=product[i][j]+" ("+prices[i][j]+") ";
            }
            switch(i) {
                case 0:
                result ="Computer-->"+result;
                break;
                case 1:
                    result ="Phone-->"+result;
                    break;
                case 2:
                    result ="Speaker-->"+result;
                    break;
            }
            System.out.println(result);
        }
    }
}
