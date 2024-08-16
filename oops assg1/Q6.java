import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        if (n<1){
            System.out.println("Invalid input");
            return;
        }
        int fibo[]=new int[n]; 
        fibo[0]=0;
        if (n>=2){
            fibo[1]=1;
        }
        for (int i=2; i<n; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        for (int i=0; i<n; i++){
            System.out.print(fibo[i]+" ");
        }
        System.out.println();   
    }
    
    
}
