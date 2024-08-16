package Q10.pkg;

//public: Accessible from any other class in any package.
//protected: Accessible within the same package and by subclasses (even if they are in different packages).
//default (package-private): Accessible only within the same package. No explicit keyword is used; it’s the default access level.
//private: Accessible only within the same class.

public class Company {
    public class Employee{
        protected String name;

        Employee(String n){
            name=n;
        }
    
        public String getName(){
            return name;
        }
    }
    
    public class Manager extends Employee{
        Manager(String n){
            super(n);
        }
        public void printName(){
            System.out.println(super.name);
        }
    
        public void modifyName(String s){
            super.name=s;
        }
    }

    public Manager createManager(String n){
        return new Manager(n);
    }

    public Employee creatEmployee(String n){
        return new Employee(n);
    }

    /*public class CEO{
        public void getName(){
            Employee e1=new Employee("Raj");
            System.out.println(e1.name);
            //protected can be accessed within the same package even if its not a subclass
        }

        //A public constructor can be accessed from any other class in any package. 
        //This allows instances of the class to be created from anywhere.
        public Employee(String n)
    }*/
}
