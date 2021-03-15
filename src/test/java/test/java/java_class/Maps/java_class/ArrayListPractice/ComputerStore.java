package test.java.java_class.ArrayListPractice;
import java.util.ArrayList;
public class ComputerStore {
    public static void main(String[] args) {
        Computer1 computer1 = new Computer1("Apple", "Macbook Pro", 1500, 13d);
        Computer1 computer2 = new Computer1("Apple", "Macbook Pro", 2000, 16d);
        Computer1 computer3 = new Computer1("Dell", "XPS", 1500, 13d);
        Computer1 computer4 = new Computer1("Asus", "asus16", 1600, 14d);
        Computer1 computer5 = new Computer1("HP", "Envy", 1500, 15d);
        Computer1 computer6 = new Computer1("Lenovo", "ThinkPad", 1500, 15d);
        Computer1 computer7 = new Computer1("Microsoft", "SurfacePro", 1200, 13d);

        ArrayList<Computer1> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);


        Computer1 computerCheapest = computers.get(0);
        for (int i = 1; i < computers.size(); i++) {
            if (computers.get(i).price < computers.get(i - 1).price) {
                computerCheapest = computers.get(i);
            }
        }
        //System.out.println(computerCheapest.toString());

        // I need computers from Apple
        for (int i = 0; i < computers.size(); i++){
            if(computers.get(i).manufacturer.equals("Apple"))
                System.out.println(computers.get(i));
        }
        // I need computer which price is in the range of $500 - $1300




    }
}