class Vehicle{
    String make;
    String model;
    int year;
    String color;
    int currentSpeed;

    Vehicle(String m, String mod, int y, String c, int cs){
        make=m;
        model=mod;
        year=y;
        color=c;
        currentSpeed=cs;
    }

    void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

    void brake(){
        System.out.println("Brake is pressed");
    }

    void turnLeft(){
        System.out.println("Vehicle turning left");
    }

    void turnRight(){
        System.out.println("Vehicle turning right");
    }
}

class Car extends Vehicle{
    int numDoors;
    public double trunkCapacity;
    
    Car(String m, String mod, int y, String c, int cs, int doors, double tc){
        super(m, mod, y, c, cs);
        numDoors=doors;
        trunkCapacity=tc;
    }

    void openTrunk(){
        System.out.println("Trunk of car opened");
    }

    void closeTrunk(){
        System.out.println("Trunk of car closed");
    }
}

class Bus extends Vehicle{
    int numSeats;
    String routeNumber;
    boolean isDoubleDecker;
    Bus(String m, String mod, int y, String c, int cs, int ns, String rn, boolean dd){
        super(m, mod, y, c, cs);
        numSeats=ns;
        routeNumber=rn;
        isDoubleDecker=dd;
    }

    void openDoors(){
        System.out.println("Doors of bus opened");
    }

    void closeDoors(){
        System.out.println("Doors of bus closed");
    }
}

class SUV extends Car{
    boolean offRoad;
    SUV(String m, String mod, int y, String c, int cs, int doors, double tc, boolean or){
        super(m, mod, y, c, cs, doors, tc);
        offRoad=or;
    }

    void engage4WD(){
        System.out.println("Engaging 4 wheel drive");
    }
}

class Sedan extends Car{
    boolean luxuryInterior;
    Sedan(String m, String mod, int y, String c, int cs, int doors, double tc, boolean li){
        super(m, mod, y, c, cs, doors, tc);
        luxuryInterior=li;
    }

    void activateMassageSeats(){
        System.out.println("Activating massage seats");
    }
}

class ElectricCar extends Car{
    int batteryCapacity;
    ElectricCar(String m, String mod, int y, String c, int cs, int doors, double tc, int bc){
        super(m, mod, y, c, cs, doors, tc);
        batteryCapacity=bc;
    }

    @Override
    void accelerate(){
        System.out.println("The electric car is accelerating");
    }

    void chargeBattery(){
        System.out.println("Electric car charging");
    }
}

class SportsCar extends Car{
    int topSpeed;
    SportsCar(String m, String mod, int y, String c, int cs, int doors, double tc, int ts){
        super(m, mod, y, c, cs, doors, tc);
        topSpeed=ts;
    }

    @Override
    void accelerate(){
        System.out.println("The sports car is accelerating.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Volvo","XC40",2019,"White",60);
        Car c1=new Car("Maruti Suzuki","S-Cross",2018,"Grey",45,4,400.00);
        Bus b1=new Bus("Scania","Coach",2020, "White",40,50,"KKD-TRV",false);
        SUV s1=new SUV("Tata","Harrier",2022,"Black",50,4,500.00,true);
        Sedan s2=new Sedan("Honda","City",2018,"Wine red",40,4,450,false);
        ElectricCar e1=new ElectricCar("Tesla","Model T",2019,"Blue",30,4,350,300);
        SportsCar s3=new SportsCar("Lamborghini","Aventador",2016,"Black",180,2,150,350);

        System.out.println("Vehicle:");
        System.out.println(v1.make+" "+v1.model+" "+v1.color+" "+v1.year+" "+v1.currentSpeed);
        v1.accelerate();
        v1.brake();
        v1.turnLeft();
        v1.turnRight();
        System.out.println();

        System.out.println("Car");
        System.out.println(c1.make+" "+c1.model+" "+c1.color+" "+c1.year+" "+c1.currentSpeed+" "+c1.numDoors+" "+c1.trunkCapacity);
        c1.accelerate();
        c1.brake();
        c1.turnLeft();
        c1.turnRight();
        c1.openTrunk();
        c1.closeTrunk();
        System.out.println();

        System.out.println("Bus");
        System.out.println(b1.make+" "+b1.model+" "+b1.color+" "+b1.year+" "+b1.currentSpeed+" "+b1.numSeats+" "+b1.routeNumber);
        b1.accelerate();
        b1.brake();
        b1.turnLeft();
        b1.turnRight();
        b1.openDoors();
        b1.closeDoors();
        System.out.println();

        System.out.println("SUV");
        System.out.println(s1.make+" "+s1.model+" "+s1.color+" "+s1.year+" "+s1.currentSpeed+" "+s1.numDoors+" "+s1.trunkCapacity+" "+(s1.offRoad? "Off road": "No off road"));
        s1.accelerate();
        s1.brake();
        s1.turnLeft();
        s1.turnRight();
        s1.openTrunk();
        s1.closeTrunk();
        s1.engage4WD();
        System.out.println();

        System.out.println("Sedan");
        System.out.println(s2.make+" "+s2.model+" "+s2.color+" "+s2.year+" "+s2.currentSpeed+" "+s2.numDoors+" "+s2.trunkCapacity+" "+(s2.luxuryInterior? "Luxury interior": "Comfortable interior"));
        s2.accelerate();
        s2.brake();
        s2.turnLeft();
        s2.turnRight();
        s2.openTrunk();
        s2.closeTrunk();
        s2.activateMassageSeats();
        System.out.println();

        System.out.println("Electric car");
        System.out.println(e1.make+" "+e1.model+" "+e1.color+" "+e1.year+" "+e1.currentSpeed+" "+e1.numDoors+" "+e1.trunkCapacity+" "+e1.batteryCapacity);
        e1.accelerate();
        e1.brake();
        e1.turnLeft();
        e1.turnRight();
        e1.openTrunk();
        e1.closeTrunk();
        e1.chargeBattery();
        System.out.println();

        System.out.println("Sports car");
        System.out.println(s3.make+" "+s3.model+" "+s3.color+" "+s3.year+" "+s3.currentSpeed+" "+s3.numDoors+" "+s3.trunkCapacity+" "+s3.topSpeed);
        s3.accelerate();
        s3.brake();
        s3.turnLeft();
        s3.turnRight();
        s3.openTrunk();
        s3.closeTrunk();
        System.out.println();
    }
}
