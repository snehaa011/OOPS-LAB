import java.util.*;

interface Borrowable{
    void checkIn(String n);
    void checkOut();
}
abstract class Book implements Borrowable{
    int bookID;
    String title,author;
    Book (int id, String t, String a){
        bookID=id;
        title=t;
        author=a;
    }

    abstract void display();
}

class TextBook extends Book{
    String status, borrowedUser;
    TextBook(int id, String t, String a){
        super(id, t, a);
        status="Available";
        borrowedUser="";
    }
    public void checkIn(String name){
        status="Borrowed";
        borrowedUser=name;
    }

    public void checkOut(){
        status="Available";
        borrowedUser="";
    }

    void display(){
        String st=status=="Available"? status: status+" by "+borrowedUser;
        System.out.println("TextBook: "+bookID+": "+title+": "+author+": "+st);
    }
}

class ReferenceBook extends Book{
    ReferenceBook(int id, String t, String a){
        super(id, t, a);
    }

    public void checkIn(String name){
        System.out.println("Cannot be borrowed");
    }

    public void checkOut(){
        System.out.println("Invalid");
    }

    void display(){
        System.out.println("ReferenceBook: "+bookID+": "+title+": "+author);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> bl=new ArrayList<>();
        int op,id;
        String t,a,uname;
        while (true) {
            System.out.println("\n1. Add reference book\n2. Add text book\n3. Check-in\n4. Check-out\n5. List books\n6. Exit\n");
            System.out.print("Enter your choice: ");
            op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Enter book ID, Title, Author:");
                    id=sc.nextInt();
                    sc.nextLine();
                    t=sc.nextLine();
                    a=sc.nextLine();
                    bl.add(new ReferenceBook(id, t, a));
                    break;

                case 2:
                    System.out.println("Enter book ID, Title, Author:");
                    id=sc.nextInt();
                    sc.nextLine();
                    t=sc.nextLine();
                    a=sc.nextLine();
                    bl.add(new TextBook(id, t, a));
                    break;

                case 3:
                    System.out.print("Enter book ID: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter username: ");
                    uname=sc.nextLine();
                    for (int i=0; i<bl.size(); i++){
                        if (bl.get(i).bookID==id){
                            bl.get(i).checkIn(uname);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter book ID: ");
                    id=sc.nextInt();
                    for (int i=0; i<bl.size(); i++){
                        if (bl.get(i).bookID==id){
                            bl.get(i).checkOut();
                        }
                    }
                    break;

                case 5:
                    for (int i=0; i<bl.size(); i++){
                        bl.get(i).display();
                    }
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
