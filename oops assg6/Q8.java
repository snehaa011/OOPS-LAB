//event must be an interface

import java.util.ArrayList;

interface Event{
    String getEventName();

    int getAvailableTickets();

    boolean bookTickets(int noOfTickets);

    void cancelTickets(int noOfTickets);

    void display();
}

class Concert implements Event{
    String eventName;
    int tickets;
    String performer;
    int itickets;
    Concert(String name, int tottickets, String perf){
        eventName=name;
        tickets=tottickets;
        performer=perf;
        itickets=tottickets;
    }

    public String getEventName(){
        return eventName;
    }
    public int getAvailableTickets(){
        return tickets;
    }
    public boolean bookTickets(int noOfTickets){
        if (tickets>=noOfTickets){
            tickets-=noOfTickets;
            return true;
        }
        return false;
    }
    public void cancelTickets(int noOfTickets){
        if (tickets+noOfTickets>itickets){
            System.out.println("Invalid.");
            return;
        }
        tickets+=noOfTickets;
        System.out.println(noOfTickets+" Tickets cancelled successfully.");
    }
    public void display(){
        System.out.println("Event name: "+eventName+"\nTotal tickets: "+tickets+"\nPerformer: "+performer);
    }
}

class TheaterPlay implements Event{
    String director;
    String eventName;
    int tickets;
    int itickets;
    TheaterPlay(String n, int tt, String d){
        eventName=n;
        tickets=tt;
        director=d;
        itickets=tt;
    }
    public String getEventName(){
        return eventName;
    }
    public int getAvailableTickets(){
        return tickets;
    }
    public boolean bookTickets(int noOfTickets){
        if (tickets>=noOfTickets){
            tickets-=noOfTickets;
            return true;
        }
        return false;
    }
    public void cancelTickets(int noOfTickets){
        if (tickets+noOfTickets>itickets){
            System.out.println("Invalid.");
            return;
        }
        tickets+=noOfTickets;
        System.out.println(noOfTickets+" Tickets cancelled successfully.");
    }
    public void display(){
        System.out.println("Event name: "+eventName+"\nTotal tickets: "+tickets+"\nDirector: "+director);       
    }
}

class SportsGame implements Event{
    String eventName;
    String teamNames;
    int tickets;
    int itickets;
    SportsGame(String n, int tt, String tn){
        eventName=n;
        tickets=tt;
        teamNames=tn;
        itickets=tt;
    }
    public String getEventName(){
        return eventName;
    }
    public int getAvailableTickets(){
        return tickets;
    }
    public boolean bookTickets(int noOfTickets){
        if (tickets>=noOfTickets){
            tickets-=noOfTickets;
            return true;
        }
        return false;
    }
    public void cancelTickets(int noOfTickets){
        if (tickets+noOfTickets>itickets){
            System.out.println("Invalid.");
            return;
        }
        tickets+=noOfTickets;
        System.out.println(noOfTickets+" Tickets cancelled successfully.");
    }
    public void display(){
        System.out.println("Event name: "+eventName+"\nTotal tickets: "+tickets+"\nTeamnames: "+teamNames);
    }
}

class EventManager{
    ArrayList<Event> l=new ArrayList<>();

    void addEvent(Event e){
        l.add(e);
        System.out.println(e.getEventName()+ " - Event has been successfully added.");
    }

    void bookEventTickets(String eventName, int numberOfTickets){
        for (int i=0; i<l.size(); i++){
            if (l.get(i).getEventName().equals(eventName)){
                boolean b= l.get(i).bookTickets(numberOfTickets);
                if (b){
                    System.out.println(numberOfTickets+" Tickets booked successfully.");
                }else{
                    System.out.println("Tickets not available.");
                }
                return;
            }
        }
        System.out.println("Event does not exist.");
    }

    void cancelEventTickets(String eventName, int numberOfTickets){
        for (int i=0; i<l.size(); i++){
            if (l.get(i).getEventName().equals(eventName)){
                l.get(i).cancelTickets(numberOfTickets);
                return;
            }
        }
        System.out.println("Event does not exist.");
    }

    void displayAllEvents(){
        for (int i=0; i<l.size(); i++){
            l.get(i).display();
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Event concert = new Concert("Summer Music Festival", 100, "The Jazz Band");
        Event play = new TheaterPlay("Shakespeare's Hamlet", 50, "John Doe");
        Event sports = new SportsGame("City Derby", 200, "Team A vs Team B");
        manager.addEvent(concert); 
        manager.addEvent(play);
        manager.addEvent(sports); // Demonstrate booking and canceling tickets
        manager.bookEventTickets("Summer Music Festival", 10);
        manager.cancelEventTickets("Shakespeare's Hamlet", 5); // Display all events
        manager.displayAllEvents();
    }
}
