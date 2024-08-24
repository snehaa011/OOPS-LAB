import java.util.*;

class Inventory<T> {
    ArrayList<T> prod= new ArrayList<>();

    void addProduct(T product){
        prod.add(product);
    }

    void removeProduct(T product){
        prod.remove(product);
    }

    void listProducts(){
        if (prod.size()==0){
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("\nProducts: ");
        for (int i=0; i<prod.size(); i++){
            System.out.println(prod.get(i).toString());
        }
    }
}

class Product{
    String name;
    Product(String n){
        name=n;
    }

    @Override
    public String toString(){
        return "Name: "+name;
    }
}

class Electronics extends Product{
    int warrantyPeriod;
    Electronics(String n, int wp){
        super(n);
        warrantyPeriod=wp;
    }

    @Override
    public String toString(){
        return "Name: "+name+"   Warranty Period: "+ warrantyPeriod+" year(s)";
    }
}

class Clothing extends Product{
    int size;
    Clothing (String n, int s){
        super(n);
        size=s;
    }

    @Override
    public String toString(){
        return "Name: "+name+"   Size: "+ size;
    }
}

public class Q1{
    public static void main(String[] args) {
        Inventory<Product> inv= new Inventory<Product>();
        Product p1=new Product("Vatika Oil");
        Clothing p2=new Clothing("Sundress", 36);
        Clothing p3=new Clothing("Pant Full", 30);
        Electronics p4=new Electronics("Iphone13", 1);
        inv.addProduct(p1);
        inv.addProduct(p2);
        inv.addProduct(p3);
        inv.addProduct(p4);
        inv.listProducts();
        inv.removeProduct(p2);
        inv.listProducts();
    }
}