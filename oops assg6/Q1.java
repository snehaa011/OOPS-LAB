class App{
    double calculateTotalPrice(int quantity, double price){
        return price*quantity;
    }

    double calculateTotalPrice(double[] price, int[] qt){
        double sum=0;
        for (int i=0; i<price.length; i++){
            sum+=(price[i]*qt[i]);
        }
        return sum;
    }

    double calculateTotalPrice(double totprice, double discount){
        return totprice - (totprice*discount);
    }
}
public class Q1{
    public static void main(String[] args){
        App a= new App();
        System.out.println("Price: "+30+"  Qt: "+5);
        System.out.println("Price of single item: "+ a.calculateTotalPrice(5, 30.0));
        int[] qt={3,2,5};
        double[] price={45.0, 60.0, 50.0};
        for (int i=0; i<3; i++){
            System.out.println("Price: "+price[i]+"  Qt: "+qt[i]);
        }
        System.out.println("Price of multiple items: "+ a.calculateTotalPrice(price,qt));
        System.out.println("Total price: "+450.0+ "  Discount: 0.05");
        System.out.println("Discounted price: "+ a.calculateTotalPrice(450.0, 0.05));

    }
}