class TicketBooking{
    void bookTicket(){
        System.out.println("Booking regular ticket..");
    }

    double calculateBookingFees(double price){
        return price*0.1;
    }
}

class VIPBooking extends TicketBooking{
    @Override
    void bookTicket(){
        System.out.println("Booking VIP tickets with additional perks..");
    }

    @Override
    double calculateBookingFees(double price){
        return price*0.05;
    }
}
public class Q6 {
    public static void main(String[] args) {
        // Create an instance of TicketBooking (for regular customers)
        TicketBooking regularBooking = new TicketBooking();
        // Create an instance of VIPBooking (for VIP customers)
        VIPBooking vipBooking = new VIPBooking();
        // Process regular ticket booking
        System.out.println("=== Regular Ticket Booking ===");
        regularBooking.bookTicket();
        double regularFee = regularBooking.calculateBookingFees(200.0);
        System.out.println("Regular booking fee: $" + regularFee);
        System.out.println();
        // Process VIP ticket booking
        System.out.println("=== VIP Ticket Booking ===");
        vipBooking.bookTicket();
        double vipFee = vipBooking.calculateBookingFees(200.0);
        System.out.println("VIP booking fee: $" + vipFee);
    }
}
