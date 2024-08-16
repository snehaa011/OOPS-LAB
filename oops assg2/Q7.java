import java.util.*;
public class Q7 {
    public class Account{
        int accno;
        String holder;
        double bal;
        Account(int no,String name, double baln ){
            accno=no;
            holder=name;
            bal=baln;
            System.out.println("Account created successfully!");
            checkBal();
        }

        void deposit(double amt){
            bal=bal+amt;
            System.out.println("Successfully deposited Rs."+amt);
            System.out.println();
            System.out.println("Updated account details: ");
            checkBal();
        }

        void withdraw(double amt){
            if (amt>bal){
                System.out.println("Insufficient balance.");
                System.out.println();
                System.out.println("Your current account details: ");
                checkBal();
                return;
            }
            bal=bal-amt;
            System.out.println("Successfully withdrew Rs."+amt);
            System.out.println();
            System.out.println("Updated account details: ");
            checkBal();
        }

        void checkBal(){
            System.out.println();
            System.out.println("Account Number: "+ accno);
            System.out.println("Account Holder: "+holder);
            System.out.println("Balance: Rs."+bal);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Q7 obj = new Q7();
        ArrayList<Account> accounts= new ArrayList<Account>();
        int accno=0, ano;
        double amt;
        while (true){
            System.out.println("\nBanking System Menu:\n" + 
                                "1. Create a new account\n" + 
                                "2. Deposit money\n" + 
                                "3. Withdraw money\n" + 
                                "4. Check balance\n" + 
                                "5. Exit");
            System.out.print("Choose an option: ");
            int op=sc.nextInt();
            
            switch(op){
                case 1: 
                    System.out.print("Enter account holder's name: ");
                    String name=sc.next();
                    System.out.print("Enter initial deposit: ");
                    double dep=sc.nextDouble();
                    accounts.add( obj.new Account(accno, name, dep));
                    accno=accno+1;
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    ano=sc.nextInt();
                    if (ano>=accounts.size()) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    System.out.print("Enter deposit amount: ");
                    amt=sc.nextDouble();
                    accounts.get(ano).deposit(amt);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    ano=sc.nextInt();
                    if (ano>=accno) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    System.out.print("Enter withdrawal amount: ");
                    amt=sc.nextDouble();
                    accounts.get(ano).withdraw(amt);
                    break;
                
                case 4:
                    System.out.print("Enter account number: ");
                    ano=sc.nextInt();
                    if (ano>=accno) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    accounts.get(ano).checkBal();
                    break;

                case 5:
                    System.out.println("Exiting the banking system.\n"+
                                        "Have a good day!");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid option.");   
            }
        }
    }
}
