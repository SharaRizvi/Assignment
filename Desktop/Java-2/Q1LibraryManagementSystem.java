import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
interface Library{
    final static int noOfBooks=0;
    final static int noOfIssuedBooks=0;
    final static Map<Integer,String> books=new LinkedHashMap<>();
    final static List<Integer> issuedBooks=new ArrayList<>();
}
class JamiaLibray implements Library{
    static String libraryName="Jamia Millia Islamia";
    static{
        books.put(101,"Science");
        books.put(102,"Maths");
        books.put(103,"Computer Science");
    }
    static void issueBook(Integer bookNo) {
        System.out.print("Issue Book: "+bookNo+"-> ");
        if(issuedBooks.contains(bookNo)){
            System.out.println("Sorry. Already issued.");
        }
        else{
            if(books.containsKey(bookNo)){
                issuedBooks.add(bookNo);
                System.out.println("Book Issued: "+books.get(bookNo)+". Thank you.");
            }
            else{
                System.out.println("Invalid book number!");
            }
        }
    }
    static void returnBook(Integer bookNo) {
        System.out.print("Return Book: "+bookNo+"-> ");
        if(issuedBooks.contains(bookNo)){
            issuedBooks.remove(bookNo);
            System.out.println("Book returned: "+books.get(bookNo)+". Thank you.");
        }
        else{
            if(books.containsKey(bookNo)){
                issuedBooks.add(bookNo);
                System.out.println("This book has not been issued.");
            }
            else{
                System.out.println("Invalid book number!");
            }
        }
    }
    static void addBooks(Integer bookNo, String bookName) {
        books.put(bookNo, bookName);
    }
}
public class Q1LibraryManagementSystem {
    public static void main(String[] args) {
        JamiaLibray.issueBook(101);
        JamiaLibray.issueBook(101);
        JamiaLibray.returnBook(101);
        JamiaLibray.returnBook(102);
        JamiaLibray.returnBook(104);
    }
}
