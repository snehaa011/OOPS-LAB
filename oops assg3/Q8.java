import java.util.*;

class Employee{
    String name;
    int age;
    String address;
    String phone;
    double salary;
    Employee(String n, int a, String adr, String p, double sal){
        name=n;
        age=a;
        address=adr;
        phone=p;
        salary=sal;
    }

    void getDetails(){
        System.out.println("\nName: "+name+"\nAge: "+age+"\nAddress: "+address+"\nPhone: "+phone+"\nSalary: Rs."+salary);
    }

    void updateDetails(String n, int a, String adr, String p, double sal){
        name=n;
        age=a;
        address=adr;
        phone=p;
        salary=sal;
    }

    void calculateAnnualSalary(){
        System.out.println("Annual salary: Rs."+salary*12);
    }
}

class Officer extends Employee{
    String specialization;
    Officer(String n, int a, String adr, String p, double sal, String spec){
        super(n, a, adr, spec, sal);
        specialization=spec;
    }

    void getSpecialization(){
        System.out.println("Specialization: "+specialization);
    }

    void updateSpecialization(String spec){
        specialization=spec;
    }

    void calculateSalary(){
        Map<String, Double> specSal = new HashMap<>();
        specSal.put("Data Science", 1.2); 
        specSal.put("Machine Learning", 1.15);    
        specSal.put("AI", 1.1);    
        specSal.put("Administrative", 1.05); 
        double factor=specSal.getOrDefault(specialization, 1.0);
        salary=salary*factor;
        super.calculateAnnualSalary();
    }
}

class Manager extends Employee{
    String dept;
    Manager(String n, int a, String adr, String p, double sal, String d){
        super(n, a, adr, p, sal);
        dept=d;
    }

    void getDepartment(){
        System.out.println("Department: "+dept);
    }

    void updateDepartment(String d){
        dept=d;
    }

    void calculateSalary(){
        Map<String, Double> deptSal = new HashMap<>();
        deptSal.put("Engineering", 1.3); 
        deptSal.put("Finance", 1.25);
        deptSal.put("Marketing", 1.2);   
        deptSal.put("Sales", 1.15);    
        deptSal.put("HR", 1.1); 

        double factor=deptSal.getOrDefault(dept, 1.0);

        salary=salary*factor;
        super.calculateAnnualSalary();
    }
}
public class Q8 {
    public static void main(String[] args) {
        Officer o1=new Officer("Madhav", 35, "Flat35, New hill, Mavoor", "9856432107", 18000, "Robotics");
        Officer o2=new Officer("Alisha", 28, "Al futtain xyz, Blr", "6743330875", 18000, "AI");

        Manager m1=new Manager("Arin", 45, "Villas 89, KKD", "5634238790", 18000, "HR");
        Manager m2=new Manager("Shresh", 56, "Mavoor House 34, KKD", "4539986706", 18000, "Engineering");

        o1.getDetails();
        o1.getSpecialization();
        o1.calculateSalary();
        System.out.println();

        o2.getDetails();
        o2.getSpecialization();
        o2.calculateSalary();
        System.out.println();

        m1.getDetails();
        m1.getDepartment();
        m1.calculateSalary();
        System.out.println();

        m2.getDetails();
        m2.getDepartment();
        m2.calculateSalary();
        System.out.println();
    }
}
