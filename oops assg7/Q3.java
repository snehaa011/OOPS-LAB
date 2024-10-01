abstract class Employee{
    int id;
    String name;
    int leaveDays;
    Employee(int i, String n, int ld){
        id=i;
        name=n;
        leaveDays=ld;
    }
    abstract double calculateSalary();
    abstract double calculateLeaveDeduction(double sal);
}

class FullTimeEmployee extends Employee{
    String position;
    double baseSalary;
    FullTimeEmployee(String n, int id, String pos, int bs, int ld){
        super(id, n, ld);
        position=pos;
        baseSalary=bs;
    }
    double calculateLeaveDeduction(double sal){
        return sal-super.leaveDays*100;
    }
    double calculateSalary(){
        double sal=baseSalary+ (position=="Manager"? 2000:500);
        return calculateLeaveDeduction(sal);
    }
    double calculatePerformanceBonus(double perfScore){
        return perfScore*200;
    }
}

class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyWage;
    PartTimeEmployee(String n, int i, double wage, int hw, int ld){
        super(i, n, ld);
        hoursWorked=hw;
        hourlyWage=wage;
    }
    double calculateLeaveDeduction(double sal){
        return sal-super.leaveDays*50;
    }
    double calculateSalary(){
        double sal=hoursWorked*hourlyWage;
        return calculateLeaveDeduction(sal);
    }
    double calculateSalary(boolean bonusApplicable){
        return calculateSalary()+500;
    }
    double calculatePerformanceBonus(double perfScore){
        return perfScore*100;
    }
}
public class Q3 {
    public static void main(String[] args) {
        // Full-time employee example with leave deduction and performance bonus
    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, "Manager",50000, 2); // 2 leave days
    System.out.println("Full-Time Salary (Manager, after leave deduction): " +
    fullTimeEmployee.calculateSalary());
    System.out.println("Full-Time Performance Bonus: " +
    fullTimeEmployee.calculatePerformanceBonus(9.2));
    // Part-time employee example with leave deduction and performance bonus
    PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 45, 20, 1); //1 leave day
    System.out.println("Part-Time Salary (with bonus, after leave deduction): " +
    partTimeEmployee.calculateSalary(true));
    System.out.println("Part-Time Performance Bonus: " +
    partTimeEmployee.calculatePerformanceBonus(8.7));

    }
}
