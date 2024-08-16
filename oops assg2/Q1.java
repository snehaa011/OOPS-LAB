import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String w=sc.nextLine();
        System.out.println("Enter a substring:");
        String s=sc.nextLine();
        sc.close();
        int j=0;
        for (int i=0; i<w.length(); i++){
            if (j>=s.length()){
                System.out.println("True");
                return;
            }
            if (w.charAt(i)==s.charAt(j)){
                j++;
                 
            }else{
                j=0;
            }
        }
        System.out.println("False");
        sc.close();
    }
}