package test.java.java_class.Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader2 {
    public static void main(String[] args) throws FileNotFoundException,InterruptedException  {
        FileInputStream file=null;
        System.out.println(System.getProperty("user.dir"));
        // it will show current Java project location
            file=new FileInputStream("Text.txt");
            Scanner scan=new  Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            int computerPrice=500;
            int myBudget=300;

            if(myBudget<computerPrice){
                throw new NullPointerException();
            }
            //Thread.sleep(1000);
                System.out.println("Test");
    }
}
