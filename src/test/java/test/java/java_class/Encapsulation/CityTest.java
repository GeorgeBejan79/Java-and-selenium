package test.java.java_class.Encapsulation;

public class CityTest {
    public static void main(String[] args) {
        City city =new City();
        city.setName("Chicago");
        city.setPopulation(500000);
        System.out.println(city.getName());
        System.out.println(city.getPopulation());
    }
}
