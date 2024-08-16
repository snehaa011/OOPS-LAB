import java.util.*;
class UnderflowException extends Exception{
    public UnderflowException(){
        super(); 
    }
}
class CreateQueue{
    Queue<Integer> queue=new LinkedList<>();
    void enqueue(int a){
        queue.add(a);
        System.out.print("Sucess ");
    }
    //methods throw exceptions not classes
    void dequeue() throws UnderflowException{
        if (queue.isEmpty()){
            throw new UnderflowException();
        }
        System.out.print(queue.peek()+" ");
        queue.remove();
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CreateQueue q= new CreateQueue();
        int n;
        try{
            while (true){
                String op=sc.next();
                switch (op.charAt(0)) {
                    case 'E':
                        n=sc.nextInt();
                        q.enqueue(n);
                        break;
                    case 'D':
                        q.dequeue();
                    default:
                        sc.close();
                        return;
                }
            }
        }catch (UnderflowException e){
            System.out.println("EmptyQueue ");
        }
        sc.close();
    }

}
