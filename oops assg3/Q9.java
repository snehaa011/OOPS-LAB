//private can only be accessed by the class
//protected can be accessed by inherited classes(subclass)
//public can be accessed anywhere
class Account{
    @SuppressWarnings("unused")
    private String accountNumber;
    protected double balance=0;
    Account(String ano){
        accountNumber=ano;
    }
    public void deposit(double amt){
        balance+=amt;
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends Account{
    protected double interestRate;
    SavingsAccount(String ano, double ir){
        super(ano);
        interestRate=ir;
    }
    public void addInterest(){
        balance+=balance*interestRate;
    }
}
public class Q9 {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount("189KDSA", 0.5);
        s.deposit(10000);
        System.out.println("Account Balance: Rs."+s.getBalance());
        s.addInterest();
        System.out.println("Account Balance: Rs."+s.getBalance());
    }
}
