/*package ArrayListPractice;


import java.util.*;
//import java.util.ArrayList;
public class ArrayListqq {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        Computer comp1 =new Computer("Macbook", 2019, "Catalina");
        Computer comp2 =new Computer("Macbook", 2020, "Pro13");
        Computer comp3 =new Computer("Windows", 2018, "Armani");
        Computer comp4 =new Computer("Google", 2020, "Chrome 1");
            computers.add(comp1);
            computers.add(comp2);
            computers.add(comp3);
            computers.add(comp4);
        System.out.println(computers.get(0));
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i).brand);
           if(computers.get(i).brand.equals("Macbook")){
               System.out.println(computers.get(i).buildYear+" "+computers.get(i).brand);
           }
        }
        for (Computer computer: computers) {
            System.out.println(computer.brand);
            if(computer.brand.equalsIgnoreCase("Chrome 1")){
                System.out.println(computer.model);
        }
    }
    }
}*/