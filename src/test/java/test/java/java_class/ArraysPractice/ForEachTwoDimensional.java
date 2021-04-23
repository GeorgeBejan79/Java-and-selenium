package test.java.java_class.ArraysPractice;

public class ForEachTwoDimensional {
    public static void main(String[] args) {

        String[][] black = {{"Apple", "Microsoft", "Google"}, {"Apple", "Samsung", "Huawei"}, {"Boss", "LG", "Beats"}};

        // Print the brand name if is equal to Apple using foreach loop
        for (String[] blue: black) {
            for (String star : blue) {

                if (star.equals("Apple")) {
                    System.out.println(star);
                }
            }
        }

    }
}