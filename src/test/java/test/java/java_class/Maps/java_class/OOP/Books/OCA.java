package test.java.java_class.OOP.Books;

public class OCA extends Book{
    //once we create the instance variables with same name
    // and same data type from the parent class
String name;
public OCA(){
    super("BOOK", 380, 20.99);// initialising var from parent class bc super word
    this.name="OCA";
}
    public static int getPage(){
        return 380;
    }
    public void getOCABookDetails(){
        System.out.println("OCA book has "+getPage()+" pages");
    }
    public  void getBookDetails(){
        System.out.println("Book is "+super.name);
        System.out.println("Page number is "+super.page);
        System.out.println("Price of the book is "+super.price);
        System.out.println("GetPage() method from super class "+Book.getPage());
        getDetails();
    }
    public static void main(String[]args){

        OCA oca=new OCA();
        System.out.println(oca.name);
        System.out.println(oca.price);
        System.out.println(oca.page);
        oca.getDetails();
        oca.getOCABookDetails();
        oca.getBookDetails();
    }
}
