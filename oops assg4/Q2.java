import java.util.*;

class Entity{
    String name;
    Entity(String n){
        name=n;
    }
    @Override
    public String toString(){
        return "Name: "+name;
    }
}

class Employee extends Entity{
    String dept;
    Employee(String n, String d){
        super(n);
        dept=d;
    }

    @Override
    public String toString(){
        return "Name: "+name+"  Dept: "+dept;
    }
}

class Manager extends Employee{
    String position;
    Manager(String n, String d, String p){
        super(n,d);
        position=p;
    }

    @Override
    public String toString(){
        return "Name: "+name+"  Dept: "+dept+"  Position: "+position;
    }
}

class HierarchicalManager<T>{
    ArrayList<T> ent=new ArrayList<>();
    void addEntity(T entity){
        ent.add(entity);
    }

    void removeEntity(T entity){
        for (int i=0; i<ent.size(); i++){
            if (ent.get(i).toString().equals(entity.toString())){
                ent.remove(i);
            }
        }
    }

    ArrayList<T> getAllEntities(){
        return ent;
    }

    ArrayList<T> getEntitiesByType(Class <? extends T> type){
        ArrayList<T> classList=new ArrayList<>();
        for (int i=0; i<ent.size(); i++){
            if (ent.get(i).getClass()==type){
                classList.add(ent.get(i));
            }
        }
        return classList;
    }

    void printHierarchy(){
        if (ent.size()==0){
            System.out.println("No employee details available.");
            return;
        }
        System.out.println();
        for (int i=0; i<ent.size(); i++){
            System.out.println(ent.get(i).toString());
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        HierarchicalManager<Entity> hm=new HierarchicalManager<>();
        Employee e1=new Employee("Avantika", "Admin");
        Employee e2=new Employee("Radhika", "HR");
        Manager m1=new Manager("Rahul","HR", "Deputy");
        Manager m2=new Manager("Ashwin", "Admin", "CEO");
        hm.addEntity(e1);
        hm.addEntity(e2);
        hm.addEntity(m1);
        hm.addEntity(m2);
        ArrayList<Entity> a= hm.getAllEntities();
        System.out.println();
        for (int i=0; i<a.size(); i++){
            System.out.println(a.get(i).toString());
        }
        hm.removeEntity(e2);
        hm.printHierarchy();
        ArrayList<Entity> n=hm.getEntitiesByType(Manager.class);
        System.out.println();
        for (int i=0; i<n.size(); i++){
            System.out.println(n.get(i).toString());
        }
    }
}
