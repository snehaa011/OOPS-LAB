package Q10.Department;

import Q10.Company.*;

public class Office {
        Manager m;

        Office(String n){
            //the constructor must be public to be accessed by another program
            m=new Manager(n);
        }
        Employee addEmployee(String n){
            Employee e=new Employee(n);
            return e;
        }

        void changeManager(String n){
            m.modifyName(n);
        }

        void findManager(){
            m.printName();
        }

        void printName(Employee e){
            System.out.println(e.getName());
        }

    public static void main(String[] args) {
        Office o=new Office("Ashok Bhatia");
        Manager m1=new Manager("Alexa Vanter");
        Employee e1=o.addEmployee("Arundathi Roy");
        Employee e2=o.addEmployee("Alan Martin");
        Employee e3=o.addEmployee("Aryan Sinhe");
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
