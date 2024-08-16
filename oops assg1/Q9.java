import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        int freq[]=new int[26];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        s=s.toLowerCase();
        for (int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for (int i=0; i<26; i++){
            if (freq[i]!=0)
                System.out.print((char)(i+'a')+"--"+freq[i]+"\n");
        }
        sc.close();
    }
}
