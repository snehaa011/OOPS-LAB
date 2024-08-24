import java.util.*;

class Author{
    String name;
    String nationality;
    Author(String na, String nt){
        name=na;
        nationality=nt;
    }

    String getName(){
        return name;
    }

    String getNationality(){
        return nationality;
    }

    void displayAuthorInfo(){
        System.out.println("Name: "+name+"  Nationality: "+nationality);
    }
}

class Book{
    String title;
    String isbn;
    Author author;
    Book(String t, String i, Author a){
        title=t;
        isbn=i;
        author=a;
    }
    void displayBookInfo(){
        System.out.println();
        System.out.println("Title: "+title);
        System.out.println("ISBN: "+isbn); 
        System.out.println("Author: "+author.getName());
    }
}

class Library{
    ArrayList<Book> bk=new ArrayList<>();
    void addBook(Book b){
        bk.add(b);
    }

    void displayBooks(){
        if (bk.size()==0){
            System.out.println("No books");
            return;
        }
        for (int i=0; i<bk.size(); i++){
            bk.get(i).displayBookInfo();
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Library lib=new Library();
        Book b1=new Book("Adventures of Gulliver", "BE128JS", new Author("Mark Karmil", "Italian"));
        Book b2=new Book("Around the world", "BW124JW", new Author("Jules Verne", "American"));
        lib.addBook(b1);
        lib.addBook(b2);
        lib.displayBooks();
    }
}
