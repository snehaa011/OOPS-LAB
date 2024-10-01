interface PoweredDevice{
    void powerOn();
    void powerOff();
}

interface NetworkEnabled{
    void connectToNetwork(String networkName);
    void diconnectFromNetwork();
}

class SmartPhone implements PoweredDevice, NetworkEnabled{
    String model;
    boolean isPoweredOn;
    String connectedNetwork="--";
    SmartPhone(String m){
        model=m;
    }
    public void powerOn(){
        isPoweredOn=true;
    }

    public void powerOff(){
        isPoweredOn=false;
    }

    public void connectToNetwork(String name){
        connectedNetwork=name;
    }

    public void diconnectFromNetwork(){
        connectedNetwork="--";
    }

    @Override
    public String toString(){
        return "\nModel: "+model+"\nPower state: "+((isPoweredOn)?"On":"Off")+"\nConnected Network: "+connectedNetwork+"\n";
    }
}

public class Q1{
    public static void main(String[] args){
        SmartPhone s=new SmartPhone("A57x980 Samsung Phone");
        s.powerOn();
        s.connectToNetwork("Airtel");
        System.out.println(s.toString());
        s.diconnectFromNetwork();
        System.out.println(s.toString());
        s.powerOff();
        System.out.println(s.toString());
    }
}