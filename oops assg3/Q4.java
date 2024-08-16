class Book{
    String title;
    String author;
    double price;
    int yearPublished;
    Book(String t, String a, double p, int y){
        title=t;
        author=a;
        price=p;
        yearPublished=y;
    }

    void displayDetails(){
        System.out.println("\nTitle: "+title+"\nAuthor: "+author+"\nPrice: $"+price+"\nYear Published: "+yearPublished);
    }
}

class Library{
    Library(){
        Book b1=new Book("The Great Gatsby","F. Scott Fitzgerald",10.99, 1925);
        Book b2=new Book("To Kill a Mockingbird", "Harper Lee", 7.99, 1960);
        Book b3=new Book("1984","George Orwell",8.99,1949);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}

public class Q4{
    public static void main(String[] args) {
        new Library();
    }
}
