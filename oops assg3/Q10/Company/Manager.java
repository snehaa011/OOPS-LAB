package Q10.Company;

public class Manager extends Employee{
    public Manager(String n){
        super(n);
    }
    public void printName(){
        System.out.println(super.name);
    }

    public void modifyName(String s){
        super.name=s;
    }
}
