import java.util.*;
public class Q3 {
    public static void swap(String[] names, int[] roll, int i, int j ){
        int temp=roll[i];
        roll[i]=roll[j];
        roll[j]=temp;
        String t=names[i];
        names[i]=names[j];
        names[j]=t;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");

        int n=sc.nextInt();
        String names[]= new String[n];
        int roll[]= new int[n];
        System.out.println("Enter roll no. and name :");

        for (int i=0; i<n; i++){
            roll[i]=sc.nextInt();
            names[i]=sc.next();
        }

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                if (roll[j]<roll[i]){
                    swap( names, roll, i, j);
                }
            }
        }

        for (int i=0; i<n ;i++){
            System.out.println(roll[i]+" "+ names[i]);
        }
        sc.close();
    }
    
    
}
