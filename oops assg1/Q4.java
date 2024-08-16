import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        String vowels="aeiouAEIOU";
        for (int i=0; i<s.length(); i++){
            if (vowels.contains((s.charAt(i))+"")){
                System.out.println("Vowel is present");
                sc.close();
                return;
            }
        }
        sc.close();
        System.out.println("Vowel is not present");
    }
}
