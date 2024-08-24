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
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String start=sc.next();

        int nr=start.charAt(0)-'0';
        int nc=start.charAt(1)-'0';
        int n=sc.nextInt();
        sc.nextLine();

        try{
            for (int k=0; k<n; k++){
                String dir=sc.next();
                switch(dir){
                    case "Right":
                        nc+=sc.nextInt();
                        test(nr,nc);
                        break;
    
                    case "Up":
                        nr-=sc.nextInt();
                        test(nr,nc);
                        break;
    
                    case "Left":
                        nc-=sc.nextInt();
                        test(nr,nc);
                        break;
    
                    case "Down":
                        nr+=sc.nextInt();
                        test(nr,nc);
                        break;
                }
            }
            System.out.println("["+nr+","+nc+"]");
        }catch(OverflowException e){
            System.out.println("Overflow");
        }
        
        sc.close();

    }
}
