import java.util.*;

interface OrderStudents{
    void orderByRollno();
    void orderByName();
}
class Student{
    String name, address;
    int rollno;
    Student (String n, int r, String a){
        name=n;
        rollno=r;
        address=a;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+address);
    }
}

class School implements OrderStudents{
    ArrayList<Student> sl=new ArrayList<>();
    void addStudent(Student s){
        sl.add(s);
    }

    public void orderByRollno(){
        Collections.sort(sl, new Comparator<Student>() {
            public int compare (Student s1, Student s2){
                return s1.rollno-s2.rollno; //positive no returned means we need to swap
            }
        });
        System.out.println("\nSorted by roll no");
        for (int i=0; i<sl.size(); i++){
            sl.get(i).display();
        }
        System.out.println();
    }

    public void orderByName(){
        Collections.sort(sl, new Comparator<Student>() {
            public int compare (Student s1, Student s2){
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("\nSorted by name");
        for (int i=0; i<sl.size(); i++){
            sl.get(i).display();
        }
        System.out.println();
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        School s=new School();
        for (int i=0; i<n; i++){
            int roll=sc.nextInt();
            String na=sc.next();
            String a=sc.next();
            s.addStudent(new Student(na, roll, a));
        }
        sc.close();
        s.orderByRollno();
        s.orderByName();
    }
}
