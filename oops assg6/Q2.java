class Travel{
    void bookTransport(String flightNo,String departure, String arrival){
        System.out.println("Your flight "+flightNo+" from "+departure+" to "+arrival+" has been booked.");
    }

    void bookTransport(int trainNo, String service){
        System.out.println("Your train "+trainNo+" - "+service+" class has been booked");
    }

    void bookTransport(String pickup, String destination){
        System.out.println("Your cab from "+pickup+" to "+destination+" has been booked.");
    }

    void bookTransport(String pickup, String destination, int passengers){
        System.out.println("Your cab from "+pickup+" to "+destination+" with "+passengers+" passengers has been booked.");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Travel t=new Travel();
        t.bookTransport("IB486XV", "Trivandrum", "Dubai");
        t.bookTransport(678590, "Economy");
        t.bookTransport("GandhiNagar St", "Agra St");
        t.bookTransport("Mavoor Road", "Palayam", 3);
    }
}
