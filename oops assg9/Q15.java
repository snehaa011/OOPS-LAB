import java.util.*;
import java.util.stream.Collectors;
class Cust{
    private final String name;
    private final Fruit fn;
    Cust(String n, Fruit f){
        name=n;
        fn=f;
    }
    String getName(){
        return name;
    }
    Fruit getFruitBought(){
        return fn;
    }
}

class Fruit{
    private final String name;
    private final double price;
    Fruit(String n,double p){
        name=n;
        price=p;
    }
    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
}

public class Q15 {
   public static void main(String[] args) {
        Fruit apple=new Fruit("Apple", 150.0);
        Fruit orange=new Fruit("Orange",180.0);
        List<Cust> sales=new ArrayList<>();
        sales.add(new Cust("Arun",apple));
        sales.add(new Cust("Ava", orange));
        sales.add(new Cust("Alan",apple));
        sales.add(new Cust("Arun",orange));
        Map<Fruit, List<Cust>> salesOfEachFruit= sales.stream().collect(Collectors.groupingBy(Cust::getFruitBought));
        //Optional<Entry<Fruit, List<Cust>>> sl=salesOfEachFruit.entrySet().stream().forEach.reduce((el)->el.getValue().size()*el.getKey().getPrice());
        List<String> fl= salesOfEachFruit.entrySet().stream().map((el)->el.getKey().getName()+" "+el.getValue().size()*el.getKey().getPrice()).toList();
        fl.forEach(System.out::println);
   } 
}

//try using groupingby and reduce
