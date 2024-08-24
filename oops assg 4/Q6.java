class Vehicle{
    void start(){
        System.out.println("Starting vehicle");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        super.start();
        System.out.println("Starting car");
    }
}

class ElectricCar extends Car{
    @Override
    void start(){
        super.start();
        System.out.println("Starting electric car" );
    }
}

class Tesla extends ElectricCar{
    @Override
    void start(){
        super.start();
        System.out.println("Starting tesla");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Tesla t=new Tesla();
        t.start();
    }
}
