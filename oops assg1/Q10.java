import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        System.out.print("a= ");
        String a=sc.next();
        System.out.print("b= ");
        String b=sc.next();
        a=a+b;
        b=a.substring(0, a.indexOf(b, a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        sc.close();
    }
}
