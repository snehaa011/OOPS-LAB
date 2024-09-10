abstract class Person{
    String name;
    String id;
    String dept;
    Person(String n, String i, String d){
        name=n;
        id=i;
        dept=d;
    }
    abstract String getRole();
    abstract double calculateWorkLoad();
    String getDetails(){
        return "Name: "+name+"\nID: "+id+"\nDepartment: "+dept;
    }
}

interface Responsibility{
    void listResponsibilities();
}

class Professor extends Person implements Responsibility{
    int coursesTaught;
    int researchProjects;
    Professor(String n, String id, String dept, int ct, int rp){
        super(n, id, dept);
        coursesTaught=ct;
        researchProjects=rp;
    }
    String getRole(){
        return "Professor";
    }
    public void listResponsibilities(){
        System.out.println("Teaching, Research, Mentoring Students");
    }

    double calculateWorkLoad(){
        return (coursesTaught*3)+(researchProjects*2);
    }
}

class Student extends Person{
    int creditsEnrolled;
    double gpa;
    Student(String n, String id, String d, int ce, double g){
        super(n, id, d);
        creditsEnrolled=ce;
        gpa=g;
    }

    String getRole(){
        return "Student";
    }

    double calculateWorkLoad(){
        return creditsEnrolled;
    }
}

class AdministrativeStaff extends Person implements Responsibility{
    int tasksHandled;
    AdministrativeStaff(String n, String id, String dept, int th){
        super(n, id, dept);
        tasksHandled=th;
    }

    String getRole(){
        return "Administrative Staff";
    }

    public void listResponsibilities(){
        System.out.println("Managing Files, Organizing Events, Supporting Faculty");
    }

    double calculateWorkLoad(){
        return tasksHandled*1.5;
    }
}

class NITCalicutManagement{
    void main(){
        Professor professor = new Professor("Dr. John Doe", "P123", "Computer Science", 3, 2);
        Student student = new Student("Alice Smith", "S456", "Electrical Engineering", 18, 3.8);
        AdministrativeStaff adminStaff = new AdministrativeStaff("Mr. Mark Johnson", "A789", "Administration", 10);
        // Display details, role, and workload of each person
        System.out.println(professor.getDetails());
        System.out.println("Role: " + professor.getRole());
        System.out.println("Workload: " + professor.calculateWorkLoad());
        professor.listResponsibilities();
        System.out.println("\n" + student.getDetails());
        System.out.println("Role: " + student.getRole());
        System.out.println("Workload: " + student.calculateWorkLoad());
        System.out.println("\n" + adminStaff.getDetails());
        System.out.println("Role: " + adminStaff.getRole());
        System.out.println("Workload: " + adminStaff.calculateWorkLoad());
        adminStaff.listResponsibilities(); 
    }
}
public class Q7 {
    public static void main(String[] args) {
        NITCalicutManagement m=new NITCalicutManagement();
        m.main();
    }
}
