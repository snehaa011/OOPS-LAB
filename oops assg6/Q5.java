class Payment{
    void processPayment(){
        System.out.println("Processing payment..");
    }

    String getPaymentMethod(){
        return "";
    }

    double calculateTransactionFee(double amt){
        return 0.0;
    }
}

class CardPayment extends Payment{
    String card;
    CardPayment(String c){
        card=c;
    }

    @Override
    void processPayment(){
        System.out.println("Processing card payment..");
    }

    @Override 
    String getPaymentMethod(){
        return card;
    }

    @Override
    double calculateTransactionFee(double amt){
        return (amt*0.02);
    }
}

class SecureCardPayment extends CardPayment{
    SecureCardPayment(String c){
        super(c);
    }

    @Override
    void processPayment(){
        System.out.println("Processing card payment..\nAdding extra security layers to card payment..");
    }

    @Override 
    String getPaymentMethod(){
        return card;
    }

    @Override
    double calculateTransactionFee(double amt){
        return (amt*0.02 +1.0);
    }
}
public class Q5 {
    public static void main(String[] args) {
        // Create an instance of CardPayment
        CardPayment cardPayment = new CardPayment("Credit card");
        System.out.println("Card Payment Method: " +cardPayment.getPaymentMethod());
        cardPayment.processPayment();
        double cardFee = cardPayment.calculateTransactionFee(100.0);
        System.out.println("Card Payment Transaction Fee: $" + cardFee);
        System.out.println();
        // Create an instance of SecureCardPayment
        SecureCardPayment securePayment = new SecureCardPayment("Secure Credit card");
        System.out.println("Secure Payment Method: " +
        securePayment.getPaymentMethod());
        securePayment.processPayment();
        double secureFee = securePayment.calculateTransactionFee(100.0);
        System.out.println("Secure Payment Transaction Fee: $" + secureFee);
        }
}
