package test.java.java_class.ArraysPractice;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "Denver", "Miami", "Montreal", "Seattle", "Rome"};
        for (int i = cities.length-1; i >=0 ; i--) {
            //System.out.println(cities[i]); // prints elements in reverse order

        String reverse="";
        for (int k = cities[i].length()-1; k >=0 ; k--) {
            reverse+=cities[i].charAt(k);
           }
        System.out.println(reverse);

        }
    }

}
