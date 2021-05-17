package test.java.java_class.Sets;
import java.util.HashSet;
import java.util.Iterator;
public class SetIteration {
    public static void main(String[] args) {

        HashSet<String> animals =new HashSet<>(); // un-ordered
            animals.add("Elephant");//1
            animals.add("Dog");//2
            animals.add("Lion");//3
            animals.add("Hippo");//4
            animals.add("Cat");
        for (String animal: animals
             ) {
            System.out.println(animal);
        }
        System.out.println("++++++");
        Iterator<String> animals2 = animals.iterator(); //transform

        //iterator.hasNext();  // if animals has next element-->return boolean
        while(animals2.hasNext()){
            String animal= animals2.next();
            if(animal.equals("Cat")){
                System.out.println("Animals2 collection has Cat inside of it");
                System.out.println("Cat was found");
            }
            else{
                System.out.println("Cat was not found");
            }
            //System.out.println(animals2.next());
        }
    }
}
