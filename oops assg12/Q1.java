class Logger{
    public static Logger newInstance = new Logger();
    private static String msg="Success";
    private Logger(){}
    public static Logger login(int flag){
        if (flag==3) msg="Warning";
        if (flag==2) msg="Error";
        if (flag==1) msg="Fatal";
        return newInstance;
    }

    public void getlogmsg(){
        System.out.println(msg);
    }
}

public class Q1{
    public static void main(String[] args) {
        Logger l1=Logger.login(0);
        l1.getlogmsg();

        Logger l2=Logger.login(1);
        l2.getlogmsg();

        Logger l3=Logger.login(2);
        l3.getlogmsg();

        Logger l4=Logger.login(3);
        l4.getlogmsg();
    }
}