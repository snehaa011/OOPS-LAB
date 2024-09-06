import java.util.*;
interface ShapeArea{
    abstract double area(double x);
}

class Circle implements ShapeArea{
    public double area(double r){
        return 3.14*r*r;
    }
}

class Square implements ShapeArea{
    public double area(double s){
        return s*s;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shape;
        double x;
        shape=sc.next();
        x=sc.nextDouble();
        if (shape.equals("Circle")){
            System.out.println(new Circle().area(x));
        }
        else if (shape.equals("Square")){
            System.out.println(new Square().area(x));
        }
        sc.close();
    }
}
