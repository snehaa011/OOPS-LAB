import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        String output="";
        for (int i=s.length()-1; i>=0; i--){
            output+=s.charAt(i);
        }
        System.out.println("Reversed string is : "+output);
        sc.close();
    }
}
