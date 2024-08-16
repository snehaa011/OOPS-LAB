import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter m: ");
        int m=sc.nextInt();
        System.out.println();
        int a[][]=new int[n][m];
        int b[][] = new int[m][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                b[i][j]=a[j][i];
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
