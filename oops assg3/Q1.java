import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String op=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.close();
            switch (op.charAt(0)) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    break;
            }
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument.");
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException: Invalid input. Enter a valid argument.");
        }
    }
}
