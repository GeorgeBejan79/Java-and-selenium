package test.java.java_class.Sets.StringExample;

public class StringMethods3 {
    public static void main(String[] args) {

        String brand ="microsoft";
        brand=brand.toUpperCase();
            System.out.println(brand);

            brand=brand.toLowerCase(); //    brand+=brand.toLowerCase();       brand = brand+brand.toLowerCase();
        System.out.println(brand.startsWith("mic"));
        boolean result =brand.startsWith("icro");
        System.out.println(result);

        boolean result2 =brand.endsWith("ft");
        System.out.println(result2);

        boolean result3 = brand.equals("microsoft"); // return true
        //              result3 = brand.equals("soft"); // returning false
        System.out.println(result3);

        boolean result4=brand.equalsIgnoreCase("MICROSOFT");
        System.out.println(result4);
    }
}
