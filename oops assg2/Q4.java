import java.util.*;
public class Q4 {
    public static int findMax(int arr[], int i, int n){
        if (i==n-1) return arr[i];
        int num=findMax(arr, i+1,n);
        return arr[i]>num? arr[i]: num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The max no. is: " +findMax(arr, 0, n));
    }
}
