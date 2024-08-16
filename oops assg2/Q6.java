import java.util.*;

public class Q6 {
    public class Person{
        boolean guest;
        boolean veg;
        String name;
        int days;
        Person(String name, boolean veg, boolean guest, int days){
            this.name=name;
            this.veg=veg;
            this.guest=guest;
            this.days=days;
        }
        void calcBill(){
            double perDay=veg? 100:120;
            double tot=perDay* days;
            if (guest){
                tot=tot*1.1;
            }
            System.out.println("Total bill for "+name+" is: "+tot);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q6 obj=new Q6();
        System.out.print("Enter number of guests:");
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("\nEnter name: ");
            String name=sc.next();
            System.out.print("Are you vegetarian? (yes/no): ");
            String veg=sc.next();
            System.out.print("Are you a guest? (yes/no): ");
            String guest=sc.next();
            System.out.print("Enter the no. of days: ");
            int d=sc.nextInt();
            boolean v=(veg.equals("yes"))? true:false;
            boolean g=(guest.equals("yes"))?true:false;
            Q6.Person p= obj.new Person(name, v, g, d);
            p.calcBill();
        }
        sc.close();
    }
}
