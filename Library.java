//Class Library
import java.util.*;
public class Library{
    public static void main(String args[])
    {
        Book ob =new Book();
        Book ob1 =new Book();

    ob.title="Python";
    ob.author="Guido van Roussum";
    ob.isAvailable=true;
    ob1.title="Java";
    ob1.author="Oracle";
    ob1.isAvailable=true;

    ob1.displayDetails();
    ob1.borrowbook();
    ob1.displayDetails();
    ob1.borrowbook();
    ob1.displayDetails();

    }
    
}
//Class Book

public class Book
{
    String title;
    String author;
    boolean isAvailable;
    public void displayDetails()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Available : "+((isAvailable)?"Yes":"No"));
    }
    public void borrowbook()
    {
        if(!isAvailable)
        {
            System.out.println(title+" has been already borrowed.");
        }
        else
        {
            isAvailable=false;
            System.out.println(title+" has been borrowed Successfully ");
        }
    }
    public void returnBook()
    {
        isAvailable=true;
        System.out.println("Book Returned");
    }

}
