import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter elemnet to search: ");
        int s=sc.nextInt();

        int l=0, r=n-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (arr[mid]==s){
                System.out.println("Element found at index "+mid);
                sc.close();
                return;
            }
            else if ( s<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
    
    
}
