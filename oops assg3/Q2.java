import java.util.*;
//custom exception 
//extends - to inherit from superclass
//implements - to implement methods in an interface
class OverflowException extends Exception{
    public OverflowException(){
        super(); //calls constructor of superclass
    }
}

//public static void test(int nr, int nc) throws OverflowException, NullPointerException, IllegalArgumentException
//to state that the test method may throw one or more exception
//these exceptions need to be handled by the calling fn using try catch
public class Q2 {
    public static void test(int nr,int nc) throws OverflowException{
        if(nr<1 || nr>8 || nc<1 || nc>8)
            throw new OverflowException();
        else
            System.out.println("["+nr+","+nc+"]");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String start=sc.next();

        int i=start.charAt(0)-'0';
        int j=start.charAt(1)-'0';
        int n=sc.nextInt();
        sc.nextLine();
        
        int u=0,r=0, d=0, l=0;
        //up=0, right=1, down=2, left3;
    
        for (int k=0; k<n; k++){
            String dir=sc.next();
            switch(dir){
                case "Right":
                    r+=sc.nextInt();
                    break;

                case "Up":
                    u+=sc.nextInt();
                    break;

                case "Left":
                    l+=sc.nextInt();
                    break;

                case "Down":
                    d+=sc.nextInt();
                    break;
            }
        }
        int nr=i+(d-u);
        int nc=j+(r-l);
        sc.close();
        try{
            test(nr,nc);
        } catch(OverflowException e){
            System.out.println("Overflow");
        }

    }
}
