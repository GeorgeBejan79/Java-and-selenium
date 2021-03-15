package test.java.java_class.ArraysPractice;
public class ReverseStringArray {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "Denver", "Miami", "Montreal", "Seattle", "Rome"};
        for (int i = cities.length - 1; i >= 0; i--) {
            //System.out.println(cities[i]);// prints cities in reverse order

            String str = "San Francisco";
            String reverse = "";
            for (int k = cities[i].length() - 1; k >= 0; k--) {

                reverse += cities[i].charAt(k);
            }
            System.out.println(reverse);  // prints cities from last char to first char
        }
    }
}