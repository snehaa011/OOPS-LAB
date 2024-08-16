import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String op=sc.next();
        switch(op.charAt(0)){
            case '+':
                System.out.println("Sum = "+(a+b));
                break;
            case '-':
                System.out.println("Difference = "+(a-b));
                break;
            case '*':
                System.out.println("Product = "+(a*b));
                break;
            case '/':
                if (b==0){
                    System.out.println("Invalid input");
                    break;
                }
                System.out.println("Quotient = "+(a/b));
                break;
            default:
                sc.close();
                return;
        }
        sc.close();
    }
}
