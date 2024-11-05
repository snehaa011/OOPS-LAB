import java.util.Scanner;

interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}

class Triangle implements Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}

abstract class ShapeFactory{
    public abstract Shape factoryMethod();
}

class CreateCircle extends ShapeFactory{
    public Shape factoryMethod(){
        return new Circle();
    }
}

class CreateRectangle extends ShapeFactory{
    public Shape factoryMethod(){
        return new Rectangle();
    }
}

class CreateTriangle extends ShapeFactory{
    public Shape factoryMethod(){
        return new Triangle();
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        switch (shape) {
            case "circle":
                ShapeFactory c = new CreateCircle();
                Shape cs = c.factoryMethod();
                cs.draw();
                break;

            case "rectangle":
                ShapeFactory r = new CreateRectangle();
                Shape rs = r.factoryMethod();
                rs.draw();
                break;

            case "triangle":
                ShapeFactory t = new CreateTriangle();
                Shape ts = t.factoryMethod();
                ts.draw();
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
