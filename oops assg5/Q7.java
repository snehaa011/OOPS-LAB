import java.util.*;

interface TaxCalculatable{
    double calculateTax();
}
abstract class Vehicle implements TaxCalculatable{
    String modelNumber;
    int numberOfWheels;
    double rateBought;
    // enum fuelType {petrol, diesal; } //use fuelType.valueOf(input string)
    String fuelType;
    Vehicle(String mn, double rate, String f){
        modelNumber=mn;
        rateBought=rate;
        fuelType=f;
    }

    abstract void display();
}

class Car extends Vehicle{
    int numberOfPassenger;
    Car(String mn, double rate, String f, int p){
        super(mn, rate, f);
        super.numberOfWheels=4;
        numberOfPassenger=p;
    }
    public double calculateTax(){
        if (super.fuelType.equals("petrol")){
            return (super.rateBought*0.1*numberOfPassenger)*0.5;
        }else{
            return (super.rateBought*0.1*numberOfPassenger)*0.4;
        }
    }

    void display(){
        System.out.println(modelNumber+" "+fuelType+" "+calculateTax());
    }
}

class Truck extends Vehicle{
    int loadLimit;
    Truck(String mn, double rate, String f, int ll){
        super(mn, rate, f);
        super.numberOfWheels=6;
        loadLimit=ll;
    }

    public double calculateTax(){
        if (super.fuelType.equals("petrol")){
            return (super.rateBought*0.1*loadLimit*0.002)*0.5;
        }else{
            return (super.rateBought*0.1*loadLimit*0.002)*0.4;
        }
    }

    void display(){
        System.out.println(modelNumber+" "+fuelType+" "+calculateTax());
    }
}
public class Q7 {
    static void sort(ArrayList<Vehicle> a){
        for (int i=0; i<a.size(); i++){
            for (int j=i+1; j<a.size(); j++){
                if (a.get(i).calculateTax()< a.get(j).calculateTax()){
                    Vehicle temp=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op, passenger, load;
        double rate;
        String mn, fuel, c;
        ArrayList<Vehicle> vl=new ArrayList<>();
        while (true){
            System.out.println("\n1. Add vehicle\n2. Display vehicles\n3. Exit\n");
            System.out.print("Enter your choice: ");
            op=sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.println("a. Car\nb. Truck");
                    System.out.print("Enter your choice: ");
                    c=sc.next();
                    switch(c.charAt(0)){
                        case 'a':
                            System.out.print("Model number: ");
                            mn=sc.next();
                            System.out.print("Rate: ");
                            rate=sc.nextDouble();
                            System.out.print("FuelType(petrol/diesal): ");
                            fuel=sc.next();
                            System.out.print("Passengers: ");
                            passenger=sc.nextInt();
                            vl.add(new Car(mn, rate, fuel, passenger));
                            break;

                        case 'b':
                            System.out.print("Model number: ");
                            mn=sc.next();
                            System.out.print("Rate: ");
                            rate=sc.nextDouble();
                            System.out.print("FuelType(petrol/diesal): ");
                            fuel=sc.next();
                            System.out.print("LoadLimit: ");
                            load=sc.nextInt();
                            vl.add(new Truck(mn, rate, fuel, load));
                            break;
                    }
                    break;

                case 2:
                    sort(vl);
                    for (int i=0; i<vl.size(); i++){
                        vl.get(i).display();
                    }
                    break;

                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
