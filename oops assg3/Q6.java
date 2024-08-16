import java.util.*;
class University{
    String name;
    ArrayList<Department> dept=new ArrayList<>();
    University(String n){
        name=n;
    }

    void addDept(Department d){
        dept.add(d);
    }

    void newProfessor(Professor p, String d){
        for (int i=0; i<dept.size(); i++){
            if (dept.get(i).name.equals(d)){
                dept.get(i).addprofessor(p);
                System.out.println("Sucessfully added professor.");
                return;
            }
        }
        System.out.println("Department not found.");
    }

    void newStudent (Student s, String d){
        for (int i=0; i<dept.size(); i++){
            if (dept.get(i).name.equals(d)){
                dept.get(i).addstudent(s);
                System.out.println("Sucessfully added student.");
                return;
            }
        }
        System.out.println("Department not found.");
    }

    void displayDept(){
        if (dept.size()==0){
            System.out.println("No departments added.");
            return;
        }
        System.out.println("\nDepartments:");
        for (int i=0; i<dept.size(); i++){
            System.out.println(dept.get(i).name);
        }
    }

    void deptInfo(String d){
        for (int i=0; i<dept.size(); i++){
            if (dept.get(i).name.equals(d)){
                dept.get(i).displayProf();
                dept.get(i).displayStudents();
                return;
            }
        }
        System.out.println("Department not found.");
    }
}

class Department{
    String name;
    ArrayList<Professor> prof=new ArrayList<>();
    ArrayList<Student> stud=new ArrayList<>();
    Department(String n){
        name=n;
    }

    void addprofessor(Professor p){
        prof.add(p);
    }

    void addstudent(Student s){
        stud.add(s);
    }

    void displayProf(){
        if (prof.size()==0){
            System.out.println("\nNo professors found.");
            return;
        }
        System.out.println("\nProfessors:");
        for (int i=0; i<prof.size(); i++){
            prof.get(i).display();
        }
    }

    void displayStudents(){
        if (stud.size()==0){
            System.out.println("\nNo students found.");
            return;
        }
        System.out.println("\nStudents:");
        for (int i=0; i<stud.size(); i++){
            stud.get(i).display();
        }
    }
}

class Professor{
    String name;
    int id;
    String dept;
    Professor(String n, int i, String d){
        name=n;
        id=i;
        dept=d;
    }

    void display(){
        System.out.println("\nID: "+id+"\nName: "+name);
    }
}

class Student{
    String name;
    int id;
    String major;
    Student(String n, int i, String m){
        name=n;
        id=i;
        major=m;
    }
    void display(){
        System.out.println("\nID: "+id+"\nName: "+name+"\nMajor: "+major);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of University: ");
        String n=sc.nextLine();
        University obj=new University(n);
        String dept,major;
        int id;
        while (true){
            System.out.println("\n1.Add department\n2.Add professor\n3.Add student\n4.List all departments\n5.List department info\n6.Exit");
            int op=sc.nextInt();
            switch(op){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name of department: ");
                    dept=sc.nextLine();
                    obj.addDept(new Department(dept));
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter name of professor: ");
                    n=sc.nextLine();
                    System.out.print("Enter professor ID: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter dept: ");
                    dept=sc.nextLine();
                    obj.newProfessor(new Professor(n, id, dept), dept);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter name of student: ");
                    n=sc.nextLine();
                    System.out.print("Enter student ID: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter major: ");
                    major=sc.nextLine();
                    System.out.print("Enter dept: ");
                    dept=sc.nextLine();
                    obj.newStudent(new Student(n, id, major), dept);
                    break;

                case 4:
                    obj.displayDept();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter dept: ");
                    dept=sc.nextLine();
                    obj.deptInfo(dept);
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");

            }
        }
    }
}
