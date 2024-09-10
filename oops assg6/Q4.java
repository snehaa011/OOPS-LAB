class Customer{
    String name;
    Customer(String n){
        name=n;
    }
    void calc(double price){
        System.out.println("Customer: "+name);
        System.out.println("Total Order Cost: Rs."+(price+5.0));
    }
}

class PremiumCustomer extends Customer{
    PremiumCustomer(String n){
        super(n);
    }

    @Override
    void calc(double price){
        System.out.println("Customer: "+name);
        System.out.println("Total Order Cost: Rs."+price);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Customer c=new Customer("Alice");
        c.calc(20.0);
        PremiumCustomer p=new PremiumCustomer("Bob");
        p.calc(30.0);
    }
}
