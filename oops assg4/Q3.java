class Employee{
    String name;
    double salary;
    int age;
    static int employeeCount=0;
    Employee(String n, double sal, int a){
        name=n;
        salary=sal;
        age=a;
        employeeCount++;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

    void raiseSalary(){
        salary+=5000;
    }

    //Static methods have access to class variables (static variables) 
    //without using the class's object (instance). 
    //Only static data may be accessed by a static method.
    static int getEmployeeCount(){
        return employeeCount;
    }

    void displayInfo(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println();
    }
}

class Analyst extends Employee{
    String spec;
    Analyst(String n, double sal, int a, String s){
        super(n, sal, a);
        spec=s;
    }

    void displayAnalystInfo(){
        System.out.println();
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
        System.out.println("Specialization: "+spec);
        System.out.println();
    }
}

class Salesperson extends Employee{
    String region;

    Salesperson(String n, double sal, int a, String r){
        super(n, sal, a);
        region=r;
    }

    void displaySalespersonInfo(){
        System.out.println();
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
        System.out.println("Region: "+ region);
        System.out.println();
    }
}
public class Q3 {
    public static void main(String[] args) {
        Employee e1=new Employee("John", 50000, 30);
        Analyst a1=new Analyst("Alice", 60000, 28, "Data Analysis");
        Salesperson s1=new Salesperson("Bob",45000,32,"Northwest");
        System.out.println("\nEmployye Info: ");

        e1.displayInfo();
        System.out.println("\nAnalyst Info:");
        a1.displayAnalystInfo();
        System.out.println("\nSalesperson Info:");
        s1.displaySalespersonInfo();

        e1.raiseSalary();
        System.out.println("\nAfter raise in employee info: ");
        e1.displayInfo();

        a1.raiseSalary();
        System.out.println("\nAfter raise in analyst info:");
        a1.displayAnalystInfo();

        s1.raiseSalary();
        System.out.println("\nAfter raise in salesperson info:");
        s1.displaySalespersonInfo();

        System.out.println("Total Employees: "+Employee.getEmployeeCount());

    }
}
