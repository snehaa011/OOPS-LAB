class Shipment{
    double weight,distance;
    Shipment(double w,double d){
        weight=w;
        distance=d;
    }
}
class DomesticShipment extends Shipment{
    String transportMode;
    DomesticShipment(double w,double d,String t){
        super(w,d);
        transportMode=t;
    }
}
class InternationalShipment extends Shipment{
    double customsDuties;
    InternationalShipment(double w,double d,double c){
        super(w,d);
        customsDuties=c;
    }
}
class ExpressShipment extends DomesticShipment{
    double expressFee;
    ExpressShipment(double w,double d,String t,double e){
        super(w,d,t);
        expressFee=e;
    }
}
class ShippingCostCalculator {
    public double calculateCost(DomesticShipment shipment){
        return (shipment.weight*1.5)+(shipment.distance*0.5);
    }
    public double calculateCost(InternationalShipment shipment){
        return (shipment.weight*2.0)+(shipment.distance*0.8)+shipment.customsDuties;
    }
    public double calculateCost(ExpressShipment shipment){
        return (shipment.weight*1.5)+(shipment.distance*0.5)+shipment.expressFee;
    }
}
public class Q2{
    public static void main(String[] args) {
        ShippingCostCalculator s=new ShippingCostCalculator();
        double d1=s.calculateCost(new DomesticShipment(15,67,"Road"));
        double d2=s.calculateCost(new InternationalShipment(20,3567,500));
        double d3=s.calculateCost(new ExpressShipment(12,270,"Air",763));
        System.out.println("Domestic Shipment :: Weight:"+15+"kg Distance:"+67+"km Transport Mode:Road Total Cost:"+d1+" rs.");
        System.out.println("International Shipment :: Weight:"+20+"kg Distance:"+3567+"km Customs duties:"+500+"rs. Total Cost:"+d2+" rs.");
        System.out.println("Express Shipment :: Weight:"+12+"kg Distance:"+270+"km Transport Mode:Air Express fee:"+763+"rs. Total Cost:"+d3+" rs.");
    }
}