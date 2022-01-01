package test.java.java_class.Sets.StringExample;

public class StringMethods4 {
    public static void main(String[] args) {

        String email = "techtorial@gmail.com";
        int indexNum = email.charAt('@');
        System.out.println(indexNum);
        System.out.println(email.substring(indexNum));//
        System.out.println(email.substring(10));

        int indexNum1 = email.indexOf(".") + 1;
        System.out.println(email.substring(email.length() - 3));

        String name = "Jennifer";
        System.out.println(name.substring(1, 5));//// 1,2,3,4, enni
        name = name.substring(5);  //fer
        System.out.println(name);
        String name1 = "Melissa";
        //name1.substring(20);
        //name1.substring(4,2);  //-->run time error
        //name.substring(3,3); // return empty string
        System.out.println(name.substring(3, 3));

        String car = "honda";
        System.out.println(car.replace("h", "H"));
        car = car.replace("honda", "toyota");

        System.out.println(car.replace("o", "1"));
        System.out.println(car.replace("k", "u"));

        String city = "   Los Angeles   ";
        System.out.println(city.trim());

        //name="Jennifer";
        //name.substring(20); throws the exeption on runtime
    }
}

