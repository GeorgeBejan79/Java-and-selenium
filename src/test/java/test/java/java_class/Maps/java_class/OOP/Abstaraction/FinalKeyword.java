package test.java.java_class.OOP.Abstaraction;

import test.java.java_class.OOP.Books.Book;

public final class FinalKeyword extends Book {
    final String city = "Chicago";//you have to initialise if is a final

    public FinalKeyword(String name, int page, double price) {
        super(name, page, price);
    }
    /*public final void printCity(){
       // System.out.println(city);
    //}
    // note print city final method inside the book class that's why we can override the print city*/
}
