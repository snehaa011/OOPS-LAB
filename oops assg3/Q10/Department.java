package Q10;

import Q10.pkg.Company;
//can only access public methods and identifiers

public class Department {
    class Office{
        Company c=new Company();
        Company.Manager m;

        Office(String n){
            //the constructor must be public to be accessed by another program
            m=c.createManager(n);
        }
        Company.Employee addEmployee(String n){
            Company.Employee e=c.creatEmployee(n);
            return e;
        }

        void changeManager(String n){
            m.modifyName(n);
        }

        void findManager(){
            m.printName();
        }

        void printName(Company.Employee e){
            System.out.println(e.getName());
        }
    }

    public static void main(String[] args) {
        Department d=new Department();
        Office o=d.new Office("Ashok Bhatia");
        Company.Manager m1=new Company().createManager("Alexa Vanter");
        Company.Employee e1=o.addEmployee("Arundathi Roy");
        Company.Employee e2=o.addEmployee("Alan Martin");
        Company.Employee e3=o.addEmployee("Aryan Sinhe");
        o.findManager();
        o.changeManager("Arun Bhatia");
        o.findManager();
        o.printName(e1);
        o.printName(e2);
        o.printName(e3);
        o.printName(m1); //treats manager as Employee too as Mnanager is a subclass
        return;
    }
}
