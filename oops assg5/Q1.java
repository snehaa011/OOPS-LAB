import java.util.*;

interface Convert{
    double convertRupees(double x);
    double convertDollars(double x);
    double convertPounds(double x);
}

class Bank implements Convert{
    public double convertRupees(double amt){
        return amt;
    }

    public double convertDollars(double amt){
        return amt*70;
    }

    public double convertPounds(double amt){
        return amt*100;
    }
}

public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bal;
        double pa, pb, pc;
        bal=sc.nextDouble();
        pa=sc.nextDouble();
        pb=sc.nextDouble();
        pc=sc.nextDouble();
        sc.close();
        Bank b=new Bank();
        bal=bal - b.convertRupees(pa) - b.convertDollars(pb) - b.convertPounds(pc);
        if (bal<0){
            System.out.println("Insufficient balance.");
            return;
        }
        System.out.println(bal);
    }
}