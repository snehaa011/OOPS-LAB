import java.util.*;
class Sensor{
    int sensorId;
    String sensorType;
    boolean isActive;
    Sensor(String type){
        sensorId=(int)Math.floor(Math.random()*10000000);
        sensorType=type;
        isActive=true;
    }

    void display(){
        System.out.println("\nSensor ID: "+sensorId+"\nSensor Type: "+sensorType+"\nisActive: "+isActive);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Sensor> sl=new ArrayList<>();
        for (int i=0; i<2; i++){
            System.out.print("Sensor type:");
            String type=sc.next();
            sl.add(new Sensor(type));
        }
        for (int i=0; i<2; i++){
            sl.get(i).display();
        }
        sc.close();
    }
}
