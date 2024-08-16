import java.util.*;
class Manager{
    HashSet<Integer> set= new HashSet<>();
    boolean addEmployee(int id){
        if (set.contains(id)){
            return false;
        }
        set.add(id);
        return true;
    }

    boolean removeEmployee(int id){
        if (!set.contains(id)){
            return false;
        }
        set.remove(id);
        return true;
    }

    void display(){
        for(int i: set){
            System.out.println(i);
        }
    }
}
public class Q11 {  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Manager m=new Manager();
        int id;
        while(true){
            System.out.println("\n1. Add an employee\n2. Remove an employee\n3. Display all employee IDs\n4. Exit");
            System.out.print("Choose an option: ");
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter id: ");
                    id=sc.nextInt();
                    System.out.println(m.addEmployee(id));
                    
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    id=sc.nextInt();
                    System.out.println( m.removeEmployee(id));
                    break;

                case 3:
                    m.display();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid");
            }
        }
    }
}
