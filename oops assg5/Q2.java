import java.util.*;
interface HDFC{
    void transact(double bal, double price);
}

interface ICICI{
    void transact(double bal, double price);
}

class Flipkart implements HDFC,ICICI{
    double cart;
    public void transact(double bal, double price){
        cart+=price;
        System.out.println(cart+" "+(bal-price));
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        @SuppressWarnings("unused")
        String na;
        double bal, price;
        Flipkart f=new Flipkart();
        for (int i=0; i<n; i++){
            na=sc.next();
            bal=sc.nextDouble();
            price=sc.nextDouble();
            f.transact(bal,price);
        }
        sc.close();
    }
}
