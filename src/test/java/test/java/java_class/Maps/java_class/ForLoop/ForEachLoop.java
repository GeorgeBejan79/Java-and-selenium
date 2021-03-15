package test.java.java_class.ForLoop;
public class ForEachLoop {
    public static void main(String[] args) {
        long[] numbers={12, 34, 56, 67, 88, 99};

        for (long num:numbers) {
            if(num >= 50 && num <= 80)
            System.out.print(num + " ");
        }
        String [] brands={"Microsoft", "Apple", "Gucci","Prada", "Guess"};
        for(String br:brands){
            if(br.toLowerCase().startsWith("g"))
            System.out.print("\n"+br);
        }
    }
}
