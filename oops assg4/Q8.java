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

    void removeBook(String t){
        for (int i=0; i<bk.size(); i++){
            if (bk.get(i).title.equals(t))
                bk.remove(i);
        }
    }

    void removeBookByAuthor(String a){
        int i=0;
        while (i<bk.size()){
            if(bk.get(i).author.name.equals(a))
                bk.remove(i);
            else
                i++;
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Author a1=new Author("JK Rowling","UK");
        a1.displayAuthorInfo();
        Author a2=new Author("Amish","India");
        a2.displayAuthorInfo();
        Book b1=new Book("Harry Potter and the Philosopher's Stone","12236767494",a1);
        b1.displayBookInfo();
        Book b2=new Book("The Scion of Ishkvaku","64728371092",a2);
        b2.displayBookInfo();
        Book b3=new Book("Sita: The Warrior of Mithila","45682612430",a2);
        b3.displayBookInfo();
        Book b4=new Book("Ravan: Enemy of Aryavarta","46734520984",a2);
        b4.displayBookInfo();
        Library l=new Library();
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.displayBooks();
        l.removeBook("Sita: The Warrior of Mithila");
        l.displayBooks();
        l.removeBookByAuthor("Amish");
        l.displayBooks();
    }
}
