import java.util.*;
class Task{
    public int p;
    public String task;
    Task (int pri, String t){
        p=pri;
        task=t;
    }
}

class TaskComparator implements Comparator<Task>{
    public int compare (Task t1, Task t2){
        if (t1.p > t2.p) return 1; //should swap
        else if (t1.p < t2.p) return -1; //correct order, no need to swap
        return 0;
    }
}

class TaskManager{
    PriorityQueue<Task> tm= new PriorityQueue<>();

    void addTask(Task t){
        tm.add(t);
    }

    void processTask(){
        if (tm.isEmpty()){
            System.out.println("No task in queue.");
            return;
        }
        System.out.println(tm.poll().task+ " -- done");
    }

    void displayTask(){
        if (tm.isEmpty()){
            System.out.println("No task in queue.");
            return;
        }
        System.out.println(tm.peek().p+ " "+ tm.peek().task);
    }
} 
public class Q12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TaskManager t=new TaskManager();
        while (true){
            System.out.println("\n1.Add a task\n2.Process a task\n3.Display next task\n4.Exit");
            System.out.print("Select option: ");
            int op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter priority: ");
                    int p=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task: ");
                    String task=sc.nextLine();
                    t.addTask(new Task(p,task));
                    break;

                case 2:
                    t.processTask();
                    break;

                case 3:
                    t.displayTask();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
