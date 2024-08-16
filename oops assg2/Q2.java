import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("Enter old substring");
        String o=sc.nextLine();
        o+=" ";
        System.out.println("Enter new substring");
        String n=sc.nextLine();
        n+=" ";
        String news="";
        int i=0;
        while (i<s.length()){
            int occ=s.indexOf(o,i);
            if (occ==-1){
                news+=s.substring(i);
                break;
            }
            news+=s.substring(i, occ);
            news+=n;
            i=occ+o.length();
        }
        sc.close();
        // s= s.replaceAll(o, n);
        System.out.println("New string is :"+ news);
    }
    
    
}
