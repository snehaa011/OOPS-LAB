import java.util.*;
public class Q5 {
    public static String reverse(String s,int i, int n){
        if (i==n-1) return ""+s.charAt(i);
        return reverse(s,i+1,n)+s.charAt(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("REVERSED STRING: "+reverse(s, 0, s.length()));
        sc.close();
    }
}
