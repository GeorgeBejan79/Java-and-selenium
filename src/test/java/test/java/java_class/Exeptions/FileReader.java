package test.java.java_class.Exeptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileReader {

    public static void main(String[] args) {

        int num= Integer.parseInt("12");
        FileInputStream file=null;
        System.out.println(System.getProperty("user.dir"));
        // it will show current Java project location
        try{file=new FileInputStream("Text.txt");
            Scanner scan=new  Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (IOException io){
            System.out.println("IO Exceptions");
        }
    }
}
