import java.util.*; 
public class Q10 { 
    class Book{ 
        String title; 
        String author; 
        int id; 
        Book(int bid, String t, String a){
            id=bid;
            title=t;
            author=a;
        }
        void display(){ 
            System.out.println("Book ID: "+id+"\nTitle: "+title+"\nAuthor: "+author); 
        } 
    } 
    class Library{ 
        ArrayList<Book> lib;
        Library(){
            lib= new ArrayList<>();
        } 
        void addBook(Book b){ 
            for (int i=0; i<lib.size(); i++){ 
                if (lib.get(i).id == b.id){ 
                    System.out.println("ID already exists!");
                    return; 
                } 
            } 
            lib.add(b); 
            System.out.println("Book added successfully."); 
        } 
        
        void removeBook(int id){ 
            for (int i=0; i<lib.size(); i++){ 
                if (lib.get(i).id == id){ 
                    lib.remove(i); System.out.println("Book removed successfully."); 
                    return; 
                } 
            } 
            System.out.println("Book not found!"); 
        } 
        
        void listAllBook(){ 
            for (int i=0; i<lib.size(); i++){ 
                lib.get(i).display(); 
                System.out.println(); 
            } 
        } 
        
        void findBook(String t){
            for (int i=0; i<lib.size(); i++){ 
                if (lib.get(i).title.equals(t)){ 
                    lib.get(i).display(); 
                    return; 
                } 
            } 
            System.out.println("Book Not Found!"); 
        } 
    } 
    
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 
        Q10 obj= new Q10();
        Library lib= obj.new Library();
        while (true){
            System.out.println("\n1. Add a book\n"+
            "2. Remove a book by ID\n"+
            "3. Display books\n"+
            "4. Find a book by title\n"+
            "5. Exit");
            System.out.print("Choose an option: ");
            int op=sc.nextInt();
            int id;
            String title, author;
            switch(op){
                case 1:
                    System.out.print("Enter book ID: ");
                    id= sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    title=sc.nextLine();
                    System.out.print("Enter author: ");
                    author= sc.nextLine();
                    Book b=obj.new Book(id, title, author);
                    lib.addBook(b);
                    break;
                
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    id=sc.nextInt();
                    lib.removeBook(id);
                    break;

                case 3:
                    System.out.println("Library books: ");
                    lib.listAllBook();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    title= sc.nextLine();
                    lib.findBook(title);
                    break;

                case 5:
                    System.out.println("Exiting library.. \n"+"Have a good day!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    } 
}