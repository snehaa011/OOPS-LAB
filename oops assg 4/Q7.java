class Employee{
    String name;
    double salary;
    Employee(String n, double sal){
        name=n;
        salary=sal;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String departmentName;
    Manager(String n, double sal, String dn){
        super(n, sal);
        departmentName=dn;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department Name: "+departmentName);
    }
}

class Developer extends Employee{
    String programmingLanguage;
    Developer(String n, double sal, String pl){
        super(n, sal);
        programmingLanguage=pl;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Manager m1=new Manager("Rahul M", 500000.0, "Finance");
        Developer d1=new Developer("Shyamala T", 300000.0, "C#");
        m1.displayDetails();
        d1.displayDetails();
    }
}
